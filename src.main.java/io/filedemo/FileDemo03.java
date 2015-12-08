package io.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * @author lfj 2015年11月4日
 * @Description: 创建文件（用常量表示路径，满足可移植性）
 */
public class FileDemo03 {
    public static void main(String[] args) {
        String path = "d:" + File.separator + "test.txt";
        File f = new File(path);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
