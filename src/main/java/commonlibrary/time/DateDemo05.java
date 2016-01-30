package commonlibrary.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj 2015年8月21日
 * @Description: 格式化日期操作---SimpleDateFormat---sdf1parse(strDate)---sdf2.format(d)
 */
public class DateDemo05 {
	public static void main(String[] args) {
		//获取当前时间并转换成字符串
		DateFormat df = DateFormat.getDateTimeInstance();
		String str = df.format(new Date()).toString();    //2015-8-21 15:09:37
		
		//第一个模版，从字符串中提取日期数字
		String pat1 = "yyyy-MM-dd HH:mm:ss";
		//第二个模版，将提取后的日期数字变成指定的格式
		String pat2 = "yyyy年MM月dd日HH时mm分ss秒";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d = null;
		try {
			d = sdf1.parse(str);  // 提取数字
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));  //将日期变成新的格式
	}
}
