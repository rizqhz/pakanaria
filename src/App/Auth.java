package App;

import java.util.HashMap;

public class Auth {
    
    public static boolean Login(String username, String password) {
        var db = new classes.Database();
        var condition = new HashMap<String, String>() {{
            put("username", username);
            put("password", password);
        }};
        var result = db.Table("kredensial")
                       .Select("id", "username", "password", "level")
                       .Where(condition)
                       .Get();
        System.out.println(result);
        return !result.isEmpty();
    }
    
}
