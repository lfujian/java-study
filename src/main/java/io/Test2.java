package io;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj  2015年12月18日
 * @Description: String --> timestamp
 */
public class Test2 {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        StringBuffer sb = new StringBuffer();
        Date date = null;
        for (int i = 1; i< 13 ; i++) {
            String dateStr = "2015-" + i +"-1";
            System.out.println(dateStr);
            try {
                date = format.parse(dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long ts = date.getTime()/1000;
            sb.append("[" + ts +",count"+"],");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
