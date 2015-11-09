package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年11月4日
 * @Description: 使用listFiles()方法判断给定的一个路径是否是目录。---listFiles()--- (列出完整的路径，返回一个File对象数组)
 */
public class FileDemo08 {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator); // 路径
        if (f.isDirectory()) {
            System.out.println(f.getPath()+"路径是目录。");
        } else {
            System.out.println(f.getPath()+"路径不是目录。");
        }
        
    }
}
