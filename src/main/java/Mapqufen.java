import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Mapqufen {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a3", "aa");
        map.put("a2", "bb");
        map.put("b1", "cc");
        for (Iterator iterator = map.values().iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
        
        Map<String, String> map1 = new LinkedHashMap<String, String>();//可以保持顺序
        map1.put("a3", "aa");
        map1.put("a2", "bb");
        map1.put("b1", "cc");
        for (Iterator iterator = map1.values().iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
        
        Map<String, String> map2 = new TreeMap<String, String>(new Comparator<Object>(){
            Collator collator = Collator.getInstance(); 
            public int compare(Object o1, Object o2) {
                CollationKey key1 = collator.getCollationKey(o1.toString());
                CollationKey key2 = collator.getCollationKey(o2.toString());
                return key1.compareTo(key2);
                //return collator.compare(o1, o2);
            }});
        map2.put("a3", "aa");
        map2.put("a2", "bb");
        map2.put("b1", "cc");
        for (Iterator iterator = map2.values().iterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
