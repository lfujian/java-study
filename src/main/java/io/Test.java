package io;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Test {
    public static void main(String[] args) {
        
        
        // 二维数组
        int intArray[ ][ ]={{1,9},{2,3},{3,4}};
        System.out.println(intArray[0][1]);
        // 一维数组
      /*  int[] s;
        s = new int[5];
        for (int i = 0; i<5; i++) {
            s[i] = i;
        }
        for(int i = 4 ; i >= 0 ; i--) {
            System.out.println("" + s[i]) ; 
        }*/
        
        //date --> timestamp 获取时间戳 
       /* System.out.println(System.currentTimeMillis()/1000); //unix时间戳
        System.out.println(new Date().getTime());*/
        
        //String --> Date
        /*DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");  
        DateFormat format2= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1 = null; 
        Date date2 = null; 
        String str1 = null;  
        String str2 = null; 
        str1 = "2007-1-18";   
        str2 = "2015年12月14日 06时44分56秒";  
        try {
            date1 = format1.parse(str1);
            date2 = format2.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1.getTime());
        System.out.println(date2);*/
        
        // Date --> String
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 0); // 今天
//      calendar.add(Calendar.DATE, -1); //得到前一天
        Date curdt = calendar.getTime();
        String strDate =  sdf.format(curdt);
        System.out.println(strDate);
    }
}