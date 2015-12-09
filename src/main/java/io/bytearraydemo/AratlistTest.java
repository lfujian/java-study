package io.bytearraydemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AratlistTest {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        // 写入十个数
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        
        System.out.println("===========循环打印输出================");
        
        // 循环打印输出
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "--");
        }
        
        System.out.println("\n===========放入迭代器中输出================");
        
        // 放入迭代器中输出
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s);
        }
        
        System.out.println("\n===========================");
        
        // 显示所有元素 方法3
        for (iterator = list.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
        // 显示所有元素 方法4
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===========================");
        // 显示所有元素 方法5(对于元素是基本数据类型和String时可以)
        System.out.println(list);

    }
}
