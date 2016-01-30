package commonlibrary.time;

import java.util.Date;

/**
 * @author lfj  2015年8月20日
 * @Description: 得到当前系统时间
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("当前日期为："+date);  //Thu Aug 20 17:15:59 CST 2015
	}
}
