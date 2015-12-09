package io.chariodemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * public abstract class Reader implements Readable, Closeable {｝
 * public FileReader(File file) throws FileNotFoundException { super(new FileInputStream(file)); }
 * @author lfj  2015年11月26日
 * @Description: 从文件中读取数据 （假设不知道文件大小，循环读取）
 */
public class ReaderDemo02 {
    public static void main(String[] args) throws Exception{
        //读这个文件里的内容
        File f = new File("d:"+File.separator+"test.txt");
        //实例化读
        Reader reader = new FileReader(f);
        // 开读，循环读，
        int len = 0;
        char c[] = new char[1024];
        int temp = 0;
        while ((temp = reader.read()) != -1) { // 直到读完结束
            c[len] = (char) temp;
            len++;
        }
        //
        reader.close();
        
        System.out.println("内容为："+new String(c,0,len));
    }
}
