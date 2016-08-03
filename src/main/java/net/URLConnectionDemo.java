package net;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    public static void main(String[] args)  throws Exception  {
        
        URL url = new URL("https://www.baidu.com");
        URLConnection urlCon = url.openConnection();
        
        System.out.println(urlCon.getContentType());
        System.out.println(urlCon.getContentLength());
    }
}
