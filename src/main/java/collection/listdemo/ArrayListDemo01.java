package collection.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author lfj  2015年12月23日
 * @Description: 增加数据
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // 实例化 只能添加String类型
        list.add("Hello");
        list.add(0, "Wilddog");     // 指定索引添加
        System.out.println(list);
        Collection<String> collection = new ArrayList<String>();
        collection.add("lfj");
        collection.add("www.wilddog.com");
        list.addAll(collection);        // 添加一组对象
        list.addAll(0, collection);
        System.out.println(list);
    }
}
