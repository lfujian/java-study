package io.bytearraydemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        // 声明一个arraylist
        List<Integer> al = new ArrayList<Integer>();
         // 放入数据
        for (int i = 1; i < 11; i++) {
            al.add(i);
        }
        // 循环输出
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + ",");
        }
        System.out.println("\n---转为 Iterator 输出---");
        // 更通用的输出方式
        for (Iterator<Integer> it = al.iterator(); it.hasNext();) {
            Integer i = (Integer) it.next();
            System.out.print(i + "-");
        }
    }
}
