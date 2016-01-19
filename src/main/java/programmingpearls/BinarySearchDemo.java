package programmingpearls;

import java.util.Arrays;

public class BinarySearchDemo {
    // 产生数组(长度50，范围0~100)
    public static int[] createArray() {
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        Arrays.sort(array);
        for (int i = 0; i < 50; i++) {
            System.out.print(array[i]+",");
        }
        return array;
    }

    // 二分搜索
    public static String search(int info, int[] array) {
        if (info < array[0] || info > array[49]) {
            return "输入不在范围内";
        }
        // 第一个位置.
        int low = 0;
        // 最高位置.数组长度-1,因为下标是从0开始的.
        int high = array.length - 1;
        int middle = 0;
        // 当low"指针"和high不重复的时候.
        while (low <= high) {
            // 中间位置计算,low+ 最高位置减去最低位置,右移一位,相当于除2.也可以用(high+low)/2
            middle = low + ((high - low) >> 1);
            // 与最中间的数字进行判断,是否相等,相等的话就返回对应的数组下标.
            if (info == array[middle]) {
                return "输入为" + array[middle];
                // 如果小于的话则移动最高层的"指针"
            } else if (info < array[middle]) {
                high = middle - 1;
                // 移动最低的"指针"
            } else {
                low = middle + 1;
            }
        }

        return "输入不在数组内";
    }

    // 测试
    public static void main(String[] args) {
        int inf = 97;
        int[] a = createArray();
        String str = search(inf, a);
        System.out.println(str);

    }
}
