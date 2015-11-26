package io.chariodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 一个字符为两个字节，Java提供了 Reade r和 Write 两个专门操作字符流的类。
 * public abstract class Writer implements Appendable, Closeable, Flushable {｝
 * public FileWriter(File file) throws IOException { super(new FileOutputStream(file)); }
 * public FileWriter(File file, boolean append) throws IOException {  super(new FileOutputStream(file, append));｝
 * @author lfj  2015年11月26日
 * @Description: 向文件中写入数据
 */
public class WriteDemo01 {
    public static void main(String[] args) throws Exception{
        //
        File f = new File("d:"+File.separator+"test.txt");
        //
        Writer out  = new FileWriter(f);
//        Writer out  = new FileWriter(f,true); // 追加而非覆盖原来的文件
        //
        String  str = "Hello wilddog";
        out.write(str); //直接输出字符串
        out.flush();
        //
        out.close();
    }
}
