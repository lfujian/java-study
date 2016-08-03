package net;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * @author lfj  2016年7月12日
 * @Description: 使用 URL 读取内容
 */
public class URLDemo {
    public static void main(String[] args) throws Exception {
                        //(String protocol, String host, int port, String file)
        URL url = new URL("http","im.wilddog.cn", 80, "/index.jsp");
        InputStream input = url.openStream();
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(input);
        scan.useDelimiter("\n");                // 设置读取分隔符
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}
/*
 * <html>
 * 
 * <body>
 * 
 * <h2>Hello World!</h2>
 * 
 * </body>
 * 
 * </html>
 */


/**
 * Scanner jdk5 后出现，简易文本扫描器
 * 
 */


