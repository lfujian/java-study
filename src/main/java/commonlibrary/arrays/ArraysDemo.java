package commonlibrary.arrays;

import java.util.Arrays;

/**
 * @author lfj  2015年8月21日
 * @Description: 操作Arrays类
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int temp[] = {3,5,7,9,1,2,6,8};
        Arrays.sort(temp);           //数组排序
        System.out.print("排序后的数组");
        System.out.println(Arrays.toString(temp));
        int point = Arrays.binarySearch(temp, 3);  //检索数据位置
        System.out.println("元素'3'的位置在："+point);
        Arrays.fill(temp, 6);               //填充数组
        System.out.print("数组填充：");
        System.out.println(Arrays.toString(temp));
    }
}
