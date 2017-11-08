package collection.map;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lfj 2016年11月19日
 * @Description: 遍历一个 Map
 */
public class Iterate {
    public static void main(String[] args) {
        // hashMap
//        iterHashMap();
        
        // linkedhashMap
        iterLinkedHashMap();
    }
    
    private static void iterHashMap() {
        Map<String, Integer> tMap = new HashMap<String, Integer>();
        tMap.put("a", 1);
        tMap.put("b", 2);
        tMap.put("f", 6);
        tMap.put("z", 26);
        tMap.put("dd", 4);
        tMap.put("e", 5);
        
        // 当 key 和 value 都需要时
        for (Map.Entry<String, Integer> entry : tMap.entrySet()) {
            System.out.println(MessageFormat.format("{0}={1}",entry.getKey(),entry.getValue()));
        }
        
        // 只需要 value 时
        System.out.println("-----只需要 value 时------");
        for (Integer i : tMap.values()) {
            System.out.println("value is "+i);
        }
        
        // 只需要 key 时
        System.out.println("-----只需要 key 时------");
        for (String s : tMap.keySet()) {
            System.out.println("key is "+s);
        }
    }
    
    /**
     * LinkedHashMap 的有序性指的是 插入数据时的顺序
     */
    private static void iterLinkedHashMap() {
        System.out.println("*********iterLinkedHashMap*************");
        Map<String, Integer> tMap = new LinkedHashMap<String, Integer>();
        
        tMap.put("a", 1);
        tMap.put("b", 2);
        tMap.put("f", 6);
        tMap.put("z", 26);
        tMap.put("dd", 4);
        tMap.put("e", 5);
        
        // 当 key 和 value 都需要时
        for (Map.Entry<String, Integer> entry : tMap.entrySet()) {
            System.out.println("key is "+entry.getKey()+", value is "+entry.getValue());
        }
        
        // 只需要 value 时
        System.out.println("-----只需要 value 时------");
        for (Integer i : tMap.values()) {
            System.out.println("value is "+i);
        }
        
        // 只需要 key 时
        System.out.println("-----只需要 key 时------");
        for (String s : tMap.keySet()) {
            System.out.println("key is "+s);
        }
        
        // --------------------- 基于最后访问时间顺序 -------------------------------
        final int initialCapacity = 10;//初始化容量
        float loadFactor = 0.75f;//加载因子，一般是 0.75f
        boolean accessOrder = true;//排序方式 false 基于插入顺序  true  基于访问顺序
        Map<String, Integer> map = new LinkedHashMap<>(initialCapacity, loadFactor, accessOrder);

        for (int i = 0; i < 15; i++) {
            map.put(String.valueOf(i), i);
        }
        //访问前顺序
        for (Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> next = it.next();
            System.out.println("linkedMap--before-->" + next.getKey());
        }
    }
}
