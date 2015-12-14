package io.systemdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author lfj  2015年12月14日
 * @Description: 为用户保存错误信息
 */
public class SysemDemo07 {
    public static void main(String[] args) {
        String str = "hello";
        try {
            System.out.println(Integer.parseInt(str)); // java.lang.NumberFormatException
        } catch (Exception e) {
            try {
                System.setOut(new PrintStream(new FileOutputStream("d:" + File.separator + "err.log")));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            System.out.println(e);  // 把异常输出到err.log文件中去。
        }
    }
}
