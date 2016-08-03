import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TraversalMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Map<String, Object> map2 = new HashMap<String, Object>();

        map2.put("222kkk", "222vvv");
        map2.put("map2-null", null);
        map2.put("z222kkk", "222vvv");

        map1.put("map2", map2);
        map1.put("map1-null", null);
        map.put("a11kk", "11vv");
        map.put("z11kk", "11vv");

        map.put("map-null", null);
        map.put("map1", map1);
        map.put("akk", "vv");
        map.put("zkkk", "vvv");

        System.out.println(map.toString());

        Object inMap;
        for (Entry<String, Object> entry : map.entrySet()) {
//            System.out.println("the key is :" + entry.getKey());
//            System.out.println("the value is :" + entry.getValue());
            inMap = entry.getValue();
            if (inMap == null) {
                map.put(entry.getKey(), "GOOD!!");
                continue;
            }
            
            gecursion(inMap);

        }

         System.out.println(map.toString());
    }

    @SuppressWarnings("unchecked")
    public static void gecursion(Object inMap) {
        if (inMap instanceof Map) {
            Map<String, Object> tmpInMap = (Map<String, Object>) inMap;
            for (Entry<String, Object> inEntry : ((Map<String, Object>) inMap).entrySet()) {
                inMap = inEntry.getValue();
                if (inMap == null) {
                    tmpInMap.put(inEntry.getKey(), "GOOD!!");
                }
                gecursion(inMap);
            }
        }
        return;
    }
}
