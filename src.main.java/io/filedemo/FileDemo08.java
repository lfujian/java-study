package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年11月4日
 * @Description: 
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
