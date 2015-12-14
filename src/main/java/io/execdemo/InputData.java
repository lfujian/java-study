package io.execdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj  2015年12月14日
 * @Description: 完成一个专门处理输入数据的类，只能得到整数和字符串
 */
public class InputData {
    private BufferedReader buf = null;
    
    public InputData() { // 在类的构造方法中实例化
        this.buf = new BufferedReader(new InputStreamReader(System.in));
    }
    public String getString (String info) {
        String temp = null;
        try {
            temp = this.buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
    public int getInt(String info,String err) {
        System.out.print(info);
        int temp = 0;
        String str = null;
        boolean flag = true;
        while (flag) {
            str = this.getString(str);
            if (str.matches("^\\d+$")) {
                temp = Integer.parseInt(str);
                flag = false;
            } else {
                System.out.println(err);
            }
        }
        return temp;
    }
    // 小数
    public float getFloat(String info,String err) {
        float temp = 0;
        String str = null;
        boolean flag = true;
        while (flag) {
            str = this.getString(info);
            if (str.matches("^\\d+.?\\d+$")) {
                temp = Float.parseFloat(str);
                flag = false;
            } else {
                System.out.println(err);
            }
        }
        return temp;
    }
    // 日期
    public Date getDate(String info,String err) {
        Date d = null;
        String str = null;
        boolean flag = true;
        while (flag) {
            str = this.getString(info);
            if (str.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    d = sdf.parse(str);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                flag = false;
            } else {
                System.out.println(err);
            }
        }
        return d;
    }
}
