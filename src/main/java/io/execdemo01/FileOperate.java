package io.execdemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 实例操作 --- 单人信息管理程序
 * @author lfj 2015年12月19日
 * @Description: 文件操作类 --- 向程序中写入对象和读取对象，只需传入一个路径即可
 */
public class FileOperate {
    private File file = null;

    public FileOperate(String pathName) {
        this.file = new File(pathName);
    }

    public boolean save(Object obj) throws Exception {
        ObjectOutputStream oos = null;
        boolean flag = false;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(this.file));
            oos.writeObject(obj);
            flag = true;
        } catch (Exception e) {
            throw e;
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
        return flag;
    }
    public Object load() throws Exception {
        Object obj = null; 
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(this.file));
            obj = ois.readObject();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
        return obj;
    }
}
