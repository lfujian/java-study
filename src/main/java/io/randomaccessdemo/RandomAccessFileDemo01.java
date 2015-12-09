package io.randomaccessdemo;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 
 * @author lfj  2015年11月4日
 * @Description: 写文件
 */
public class RandomAccessFileDemo01 {
    public static void main(String[] args) throws Exception{
        File f = new File("d:"+File.separator+"test.txt");
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "rw"); //以只读方式打开文件，会自动创建新文件。
        String name = null;
        int age = 0;
        name = "zhangsan";
        age = 3000;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        
        name = "lisibbbb";
        age = 3100;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        
        name = "wangwuaa";
        age = 3200;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        rdf.close();
    }
}
