package io.chariodemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * public abstract class Reader implements Readable, Closeable {｝
 * public FileReader(File file) throws FileNotFoundException { super(new FileInputStream(file)); }
 * @author lfj  2015年11月26日
 * @Description: 从文件中读取数据
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws Exception{
        //
        File f = new File("d:"+File.separator+"test.txt");
        //
        Reader reader = new FileReader(f);
        //
        char c[] = new char[1024]; // 所有内容读取到此数组中
        int len = reader.read(c);
        //
        reader.close();
        
        System.out.println("内容为："+new String(c,0,len));
    }
}
