package io.randomaccessdemo;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 读取时直接使用r的模式即可，以只读的方式打开文件。
 * 读取时所有的字符串只能按照byte数组的方式读取出来，而且所有的长度是8位。
 * @author lfj  2015年11月9日
 * @Description: 随机读取。
 */
public class RandomAccessFileDemo02 {
    // 直接抛出异常，程序中可以不再分别处理。
    public static void main(String[] args) throws Exception{
        File f = new File("d:"+File.separator+"test.txt");
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "r"); //以读方式打开文件，会自动创建新文件。
        String name = null;
        int age = 0;
        byte b[] = new byte[8];
        
        rdf.skipBytes(12);
        for (int i=0;i<b.length;i++) {
            b[i]=rdf.readByte();
        }
        name = new String(b);
        age = rdf.readInt();
        System.out.println("第二个人的信息-->姓名："+name+";年龄："+age);
        rdf.seek(0);
        b = new byte[8];
        for (int i=0;i<b.length;i++) {
            b[i]=rdf.readByte();
        }
        name = new String(b);
        age = rdf.readInt();
        System.out.println("第一个人的信息-->姓名："+name+";年龄："+age);
        rdf.skipBytes(12);
        b = new byte[8];
        for (int i=0;i<b.length;i++) {
            b[i]=rdf.readByte();
        }
        name = new String(b);
        age = rdf.readInt();
        System.out.println("第三个人的信息-->姓名："+name+";年龄："+age);
        rdf.close();
    }
}
