package io.byteiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lfj 2015年11月26日
 * @Description: 从文件中读取内容
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        // 2.通过子类实例化父类对象
        InputStream input = new FileInputStream(f);
         // 3.进行读操作
        byte b[] = new byte[1024]; // 所有的内容读到此数组中
        input.read(b);
        
        // 或通过循环，把数组中的内容一个个写到文件之中
       /* for (int i =0;i<b.length;i++) {
            b[i] = (byte) input.read();
        }*/
        
        // 4.关闭输入流
        input.close();
        System.out.println("内容为：" + new String(b)); // 把数组变成字符串输出
    }
}
// 控制台后面有很多个空格是因为开辟的1024字节数组没用完
