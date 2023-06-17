package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    
    private static Connection handler = null;
    
    private static String query;
    private static String table;
    
    private static final ArrayList<String> column = new ArrayList<>();
    
    public static void create() {
        String user = Config.DB.get("user");
        String pass = Config.DB.get("pass");
        String url = String.format("jdbc:mysql://%s/%s", Config.DB.get("host"), Config.DB.get("name"));
        try {
            handler = DriverManager.getConnection(url, user, pass);
            // System.out.println("Berhasil terkoneksi");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Database() {
        if (handler == null) {
            Database.create();
        }
    }
    
    public Database Table(String name) {
        table = name;
        query = "SELECT * FROM " + table;
        return this;
    }
    
    public Database Select(String ...fields) {
        String buffer = new String();
        for (String field : fields) {
            column.add(field);
            buffer += (", " + field);
        }
        buffer = buffer.substring(2);
        query = query.replace("*", buffer);
        return this;
    }
    
    public Database Where(HashMap<String, String> condition) {
        String buffer = " WHERE ";
        for (String key : condition.keySet()) {
            buffer += String.format("%s = '%s' AND ", key, condition.get(key));
        }
        buffer = buffer.substring(0, buffer.length() - 5);
        query += buffer;
        return this;
    }
    
    public Database Join(String table, String mode, int key, int refkey) {
        var a = Database.table;
        var b = table;
        var buffer = String.format(" %s JOIN %s ON %s.%d = %s.%d", 
                mode, table, a, key, b, refkey);
        query += buffer;
        return this;
    }
    
    public Database InnerJoin(String table, int key, int refkey) {
        this.Join(table, "INNER", key, refkey);
        return this;
    }
    
    public Database LeftJoin(String table, int key, int refkey) {
        this.Join(table, "LEFT", key, refkey);
        return this;
    }
    
    public Database RightJoin(String table, int key, int refkey) {
        this.Join(table, "RIGHT", key, refkey);
        return this;
    }
    
    public ArrayList<HashMap<String, String>> Get() {
        // System.out.println(query);
        ResultSet result = null;
        ArrayList<HashMap<String, String>> data = new ArrayList<>();
        try {
            Statement statement = handler.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                HashMap<String, String> buffer = new HashMap<>();
                for (String col : column) {
                    buffer.put(col, result.getString(col));
                }
                data.add(buffer);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        column.clear();
        return data;
    }
    
    public int Insert(HashMap<String, String> data) {
        query = query.replace("SELECT * FROM", "INSERT INTO");
        String col = new String(), val = new String();
        for (String key : data.keySet()) {
            col += String.format(", %s", key);
            val += String.format(", '%s'", data.get(key));
        }
        col = col.substring(2);
        val = val.substring(2);
        query += String.format(" (%s) VALUES (%s)", col, val);
        int result = 0;
        try {
            Statement statement = handler.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    public int Update(HashMap<String, String> data) {
        query = query.replace("SELECT * FROM", "UPDATE");
        String buffer = new String();
        for (String key : data.keySet()) {
            buffer += String.format(", %s = '%s'", key, data.get(key));
        }
        buffer = buffer.substring(2);
        var pieces = query.split("WHERE");
        query = pieces[0] + String.format("SET %s WHERE", buffer) + pieces[1];
        int result = 0;
        try {
            Statement statement = handler.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    public int Delete() {
        query = query.replace("SELECT * FROM", "DELETE FROM");
        int result = 0;
        try {
            Statement statement = handler.createStatement();
            result = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
}
