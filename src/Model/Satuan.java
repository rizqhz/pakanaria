package Model;

import classes.Database;
import java.util.ArrayList;
import java.util.HashMap;

public class Satuan {
    
    private static final Database db = new Database();
    
    public static ArrayList<HashMap<String, String>> Get() {
        var result = db.Table("satuan")
                       .Select("id", "satuan", "deskripsi", "simbol")
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        var result = db.Table("satuan")
                       .Select("id", "satuan", "deskripsi", "simbol")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(String satuan) {
        var condition = new HashMap<String, String>() {{
            put("satuan", satuan);
        }};
        var result = db.Table("satuan")
                       .Select("id", "satuan", "deskripsi", "simbol")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static void Add(String ...data) {
        String[] fields = {"satuan", "deskripsi", "simbol"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        db.Table("satuan").Insert(buffer);
    }
    
    public static void Edit(int id, String ...data) {
        String[] fields = {"satuan", "deskripsi", "simbol"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("satuan").Where(condition).Update(buffer);
    }
    
    public static void Destroy(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("satuan").Where(condition).Delete();
    }
    
}
