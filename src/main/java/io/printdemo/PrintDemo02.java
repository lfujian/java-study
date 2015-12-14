package io.printdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 使用打印流进行格式化 --- printf()
 * @author lfj  2015年12月10日
 * @Description: 格式化输出
 */
public class PrintDemo02 {
    public static void main(String[] args) throws Exception{
        PrintStream ps = null ;
        ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        String name = "lifujian";
        int age = 22;
        float score = 666.66f;
        char gender = 'M';
        ps.printf("姓名:%s;年龄:%d;成绩:%f;性别:%c",name,age,score,gender);
        // 也可以都用%s
        ps.printf("姓名:%s;年龄:%s;成绩:%s;性别:%s",name,age,score,gender);
        ps.close();
    }
}
