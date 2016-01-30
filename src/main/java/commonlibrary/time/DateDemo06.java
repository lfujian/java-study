package commonlibrary.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author lfj  2015年8月21日
 * @Description: 设计一个取得日期的类，此类可以取得系统的当前时间和时间戳
 * 						    这种写法太长、太复杂，应该用SimpleDateFormat实现
 */
public class DateDemo06 {
	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println("系统时间: "+dt.getDate());
		System.out.println("当前时间: "+dt.getDateComplete());
		System.out.println("时间戳: "+dt.getTimeStamp());
	}

}

class DateTime {
	private Calendar calendar = null ; //定义一个Calendar对象，可以取得时间
	public DateTime() {
		this.calendar = new GregorianCalendar();  //通过Calendar类的子类实例化
	}
	public String getDate(){
		StringBuffer buf= new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-");
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append("-");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append(" ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append(":");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append(":");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append(".");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		return buf.toString();
	}
	
	//得到完整的日期
	public String getDateComplete(){
		StringBuffer buf= new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("年");
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append("月");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append("日 ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append("时");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append("分");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append("秒");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		buf.append("毫秒");
		return buf.toString();
	}
	
	//得到时间戳
	public String getTimeStamp(){
		StringBuffer buf= new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR));
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		return buf.toString();
	}
	
	//补零
	private String addZero(int num,int len){
		StringBuffer s = new StringBuffer();
		s.append(num);
		while(s.length()<len){
			s.insert(0, "0");
		}
		return s.toString();
	}
}