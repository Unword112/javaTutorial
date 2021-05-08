/**
Modify and return the given map as follows: if the key "a" has a value, 
set the key "b" to have that same value. In all cases remove the key "c",
 leaving the rest of the map unchanged.
*/
import java.util.HashMap;
import java.util.Map;

public class mapShare {
    public Map<String, String> mapB(Map<String, String> map) {
            if(map.containsKey("a"))
                map.put("b", map.get("a"));
            if(map.containsKey("c"))
                map.remove("c");
        return map;
    }
    public static void main(String[] args) {
        mapShare m = new mapShare();
        Map<String, String> ma = new HashMap<>();
        ma.put("a", "candy");
        ma.put("b", "dirt");
        ma.put("c", "code");
        System.out.println(m.mapB(ma));
    }    
}
