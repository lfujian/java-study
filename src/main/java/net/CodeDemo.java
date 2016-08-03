package net;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author lfj  2016年7月12日
 * @Description: 编解码
 */
public class CodeDemo {
    public static void main(String[] args) throws Exception {
        String str = "野狗 Wilddog";
        String encode = URLEncoder.encode(str, "UTF-8");
        System.out.println("编码之后的内容:" + encode);
        
        String decod = URLDecoder.decode(encode, "UTF-8");
        System.out.println("解码之后的内容:" + decod);
    }
}
