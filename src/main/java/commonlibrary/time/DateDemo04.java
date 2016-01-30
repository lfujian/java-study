package commonlibrary.time;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author lfj 2015年8月20日
 * @Description: 格式化日期操作---DateFormat.getDateInstance
 */
public class DateDemo04 {
	public static void main(String[] args) {
		DateFormat df1 = null; // 先声明对象
		DateFormat df2 = null;
		df1 = DateFormat.getDateInstance(); // 取得日期
		df2 = DateFormat.getDateTimeInstance(); // 日期时间
		System.out.println("Date：" + df1.format(new Date())); // Date：2015-8-20
		System.out.println("DateTime：" + df2.format(new Date())); // DateTime：2015-8-20
																	// 17:53:49

		// 显示指定的风格
		DateFormat df3 = null; // 先声明对象
		DateFormat df4 = null;
		df3 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale(
				"zh", "CN")); // 取得日期，并设置日期显示风格
		df4 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,
				DateFormat.ERA_FIELD, new Locale("zh", "CN")); // 设置日期和时间的显示格式
		System.out.println("----------------显示指定的风格---------------------");
		System.out.println("Date：" + df3.format(new Date())); // Date：2015年8月20日
		System.out.println("DateTime：" + df4.format(new Date())); //DateTime：2015年8月20日 下午05时58分43秒 CST
																	// 17:53:49s
	}
}
