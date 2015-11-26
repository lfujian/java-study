package io.byteiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lfj 2015年11月26日
 * @Description: 另一种方式的读取 （不知道要读取文件的大小）
 */
public class InputStreamDemo05 {
    public static void main(String[] args) throws Exception {
        // 1.使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt");
        // 2.通过子类实例化父类对象
        InputStream input = new FileInputStream(f);
         // 3.进行读操作
        int len = 0;
        byte b[] = new byte[1024];
        int temp = 0;
        while ((temp = input.read()) != -1) {
            // 将每次的读取内容给temp变量，如果temp的值不是-1，则表示文件没有读完
            b[len] = (byte) temp;
            len++;
        }
        // 4.关闭输入流
        input.close();
        
        System.out.println("读入数据的长度:"+len);
        System.out.println("内容为：" + new String(b,0,len)); // 把数组变成字符串输出
    }
}

