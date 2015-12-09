package io.printdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 字节打印流
 * @author lfj  2015年12月9日
 * @Description: 使用 PrintStream 输出
 */
public class PrintDemo01 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = null;
        // 此时通过FileOutputStream实例化，意味着所有的输出是向文件中打印
        ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "test.txt")));
        ps.print("hello ");
        ps.println("wilddog!!");
        ps.println("1+1="+2);
        ps.close();
    }
}
