package io.execdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author lfj  2015年12月14日
 * @Description: 输入两个数字，并让两个数字相加
 */
public class ExecDemo01 {
    public static void main(String[] args) throws Exception{
        int i = 0;
        int j = 0;
        BufferedReader buf = null;
        buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入第一个数字：");
        str = buf.readLine();
        i = Integer.parseInt(str);
        System.out.println("请输入第二个数字：");
        str = buf.readLine();
        j = Integer.parseInt(str);
        System.out.println(i + "+" + j + "=" + (i+j));
    }
}
