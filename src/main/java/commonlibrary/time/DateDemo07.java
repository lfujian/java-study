package commonlibrary.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj  2015年8月21日
 * @Description: 用SimpleDateFormat实现一个取得日期的类，此类可以取得系统的当前时间和时间戳
 */
public class DateDemo07 {
	public static void main(String[] args) {
		DateTime1 dt = new DateTime1();
		System.out.println("系统时间: "+dt.getDate());
		System.out.println("当前时间: "+dt.getDateComplete());
		System.out.println("时间戳: "+dt.getTimeStamp());
	}

}

class DateTime1 {
	//声明日期格式化操作对象，直接对new Date()进行实例化
	private SimpleDateFormat sdf = null ;
	//获得完整时间（英文）
	public String getDate(){
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		return this.sdf.format(new Date());
	}
	//获得完整时间（中文）
	public String getDateComplete(){
		this.sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
		return this.sdf.format(new Date());
	}
	//获得时间戳
	public String getTimeStamp(){
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}
}




