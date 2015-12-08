package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年11月4日
 * @Description: 使用list()方法列出一个目录中的全部内容。---list()--- (列出全部名称，返回一个字符串数组)
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator);
        String str[] = f.list(); // 列出给定目录的内容。
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
