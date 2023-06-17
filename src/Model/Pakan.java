package Model;

import classes.Database;
import java.util.ArrayList;
import java.util.HashMap;

public class Pakan {
    
    private static final Database db = new Database();
    
    public static ArrayList<HashMap<String, String>> Get() {
        var result = db.Table("pakan")
                       .Select("id", "kode", "nama", "kategori", "hewan", "deskripsi", "satuan_id", "supplier_id")
                       .Get();
        return result;
    }
    
    public static ArrayList<HashMap<String, String>> Get(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        var result = db.Table("pakan")
                       .Select("id", "kode", "nama", "kategori", "hewan", "deskripsi", "satuan_id", "supplier_id")
                       .Where(condition)
                       .Get();
        return result;
    }
    
    public static void Add(String ...data) {
        String[] fields = {"kode", "nama", "kategori", "hewan", "deskripsi", "satuan_id", "supplier_id"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        db.Table("pakan").Insert(buffer);
    }
    
    public static void Edit(int id, String ...data) {
        String[] fields = {"kode", "nama", "kategori", "hewan", "deskripsi", "satuan_id", "supplier_id"};
        var buffer = new HashMap<String, String>();
        for (int i = 0; i < fields.length; i++) {
            buffer.put(fields[i], data[i]);
        }
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("pakan").Where(condition).Update(buffer);
    }
    
    public static void Destroy(int id) {
        var condition = new HashMap<String, String>() {{
            put("id", String.valueOf(id));
        }};
        db.Table("pakan").Where(condition).Delete();
    }
    
}
