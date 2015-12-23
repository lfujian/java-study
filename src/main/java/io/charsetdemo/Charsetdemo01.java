package io.charsetdemo;

/**
 * @author lfj  2015年12月19日
 * @Description: 获得系统的默认编码
 */
public class Charsetdemo01 {
    public static void main(String[] args) {
        System.out.println("系统的默认编码：" + System.getProperty("file.encoding"));
    }
}
