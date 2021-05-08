import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public Map<String, String> mAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a" + "b"));
            }
            return map;
        } 
    public static void main(String[] args) {
        mapAB m = new mapAB();
        Map<String, String> ma = new HashMap<>();
        ma.put("a", "candy");
        ma.put("b", "dirt");
        ma.put("c", "code");
        System.out.println(m.mAB(ma));
    }    
}
