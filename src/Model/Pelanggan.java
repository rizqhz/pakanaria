package Model;

import classes.Database;
import java.util.ArrayList;
import java.util.HashMap;

public class Pelanggan {
    
    private static final Database db = new Database();
    
    public static ArrayList<HashMap<String, String>> Get() {
        var result = db.Table("pelanggan")
                       .Select("nama", "alamat", "telepon", "email")
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        var result = db.Table("pelanggan")
                       .Select("nama", "alamat", "telepon", "email")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static void Add(String ...data) {
        String[] fields = {"nama", "alamat", "telepon", "email"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        db.Table("pelanggan").Insert(buffer);
    }
    
    public static void Edit(int id, String ...data) {
        String[] fields = {"nama", "alamat", "telepon", "email"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("pelanggan").Where(condition).Update(buffer);
    }
    
    public static void Destroy(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("pelanggan").Where(condition).Delete();
    }
    
}
