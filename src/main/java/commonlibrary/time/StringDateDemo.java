package commonlibrary.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj 2015��8��21��
 * @Description: ��String�����ݱ�ΪDate������ (Java���ݿ����л��õ�)
 */
public class StringDateDemo {
	public static void main(String[] args) {
		String strDate = "2015-08-21 15:16:28.478";
		String pat = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(pat);
		Date d = null;
		try {
			d = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d); // Fri Aug 21 15:16:28 CST 2015
	}
}
