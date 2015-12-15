package io.datademo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * 数据操作流 与平台无关
 * @author lfj  2015年12月15日
 * @Description: 将订单数据写入到文件 order.txt 中
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = null;
        File f = new File("D:" + File.separator + "order.txt");
        dos = new DataOutputStream(new FileOutputStream(f));
        String names[] = {"衬衣","手套","围巾"};
        float prices[] = {98.3f, 30.3f, 50.5f};
        int nums[] = {3,2,1};
        for (int i =0;i<names.length;i++) {
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }
        dos.close();
    }
}
