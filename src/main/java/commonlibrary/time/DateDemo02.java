package commonlibrary.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author lfj  2015��8��20��
 * @Description: �õ���ǰϵͳ ���� ʱ��---Calendar
 */
public class DateDemo02 {
	public static void main(String[] args) {
		Calendar calendar = null;
		calendar = new GregorianCalendar();
		System.out.println("�꣺"+calendar.get(Calendar.YEAR));
		System.out.println("�£�"+(calendar.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��"+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+calendar.get(Calendar.MINUTE));
		System.out.println("�룺"+calendar.get(Calendar.SECOND));
		System.out.println("���룺"+calendar.get(Calendar.MILLISECOND));
	}
}
