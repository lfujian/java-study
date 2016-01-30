package commonlibrary.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author lfj  2015年8月20日
 * @Description: 得到当前系统 具体 时间---Calendar
 */
public class DateDemo02 {
	public static void main(String[] args) {
		Calendar calendar = null;
		calendar = new GregorianCalendar();
		System.out.println("年："+calendar.get(Calendar.YEAR));
		System.out.println("月："+(calendar.get(Calendar.MONTH)+1));
		System.out.println("日："+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("时："+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+calendar.get(Calendar.MINUTE));
		System.out.println("秒："+calendar.get(Calendar.SECOND));
		System.out.println("毫秒："+calendar.get(Calendar.MILLISECOND));
	}
}
