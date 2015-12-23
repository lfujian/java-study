package collection.listdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lfj  2015年12月23日
 * @Description: 删除  输出list  将集合变为对象数组  其他操作
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1-hello");
        list.add(0,"Wilddog");
        list.add("2-lfj");
        list.add("3-cccc");
        list.add("4-ddd");
        list.add("5-eee");
        System.out.println(list);
        list.remove(0);     //指定索引删除
        list.remove("lfj");     //指定元素删除
        System.out.println("删除后--"+list);
        
        System.out.println("===========输出list中的内容==============");
        
        for (int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + "、");
        }
        System.out.println("\n----从后往前输出");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "、");
        }
        
        System.out.println("\n\n===========将集合变为数组、对象数组==============");
        
        String str[] = list.toArray(new String[] {});
        for (int i = 0; i<str.length;i++) {
            System.out.print(str[i] + "、");
        }
        System.out.println("\n\t---转为对象数组---");
        Object obj[] = list.toArray();
        for (int i = 0; i<obj.length;i++) {
            String temp = (String) obj[i];
            System.out.print(temp + "、");
        }
        
        System.out.println("\n\n===========集合的其他操作==============");
        
        System.out.println(list.contains("2-lfj") ? "字符存在" : "字符不存在");
        System.out.println("\t---取出里面的部分集合---");
        List<String> subList = list.subList(2, 3); //包含2 没有3
        for (int i = 0; i<subList.size(); i++) {
            System.out.print(subList.get(i) + "、");
        }
        System.out.println("\n元素 4-ddd 所在位置：" + list.indexOf("4-ddd"));
        System.out.println("集合是否为空：" + list.isEmpty());
    }
}
