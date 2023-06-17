package Model;

import classes.Database;
import java.util.ArrayList;
import java.util.HashMap;

public class Supplier {
    
    private static final Database db = new Database();
    
    public static ArrayList<HashMap<String, String>> Get() {
        var result = db.Table("supplier")
                       .Select("id", "nama", "alamat", "telepon", "email", "website", "deskripsi")
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        var result = db.Table("supplier")
                       .Select("id", "nama", "alamat", "telepon", "email", "website", "deskripsi")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(String nama) {
        var condition = new HashMap<String, String>() {{
            put("nama", nama);
        }};
        var result = db.Table("supplier")
                       .Select("id", "nama", "alamat", "telepon", "email", "website", "deskripsi")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static void Add(String ...data) {
        String[] fields = {"nama", "alamat", "telepon", "email", "website", "deskripsi"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        db.Table("supplier").Insert(buffer);
    }
    
    public static void Edit(int id, String ...data) {
        String[] fields = {"nama", "alamat", "telepon", "email", "website", "deskripsi"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("supplier").Where(condition).Update(buffer);
    }
    
    public static void Destroy(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("supplier").Where(condition).Delete();
    }
    
}
