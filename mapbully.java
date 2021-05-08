/*
Modify and return the given map as follows: if the key "a" has a value, 
set the key "b" to have that value, and set the key "a" to have the value "". 
Basically "b" is a bully, taking the value and replacing it with the empty string.
*/
import java.util.HashMap;
import java.util.Map;

public class mapbully {
    public Map<String, String> mapB(Map<String, String> map) {
            if(map.containsKey("a")){
                map.put("b", map.get("a"));
                map.put("a" , "");
            }
        return map;
    }
    public static void main(String[] args) {
        mapbully m = new mapbully();
        Map<String, String> ma = new HashMap<>();
        ma.put("a", "candy");
        ma.put("b", "dirt");
        ma.put("c", "code");
        System.out.println(m.mapB(ma));
    }    
}
