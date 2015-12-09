package io.filedemo;

import java.io.File;

/**
 * @author lfj 2015年11月4日
 * @Description: 使用listFiles()方法列出一个目录中的全部内容。---listFiles()--- (列出完整的路径，返回一个File对象数组)
 */
public class FileDemo07 {
    public static void main(String[] args) {
        File f = new File("d:" + File.separator);
        File files[] =f.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
