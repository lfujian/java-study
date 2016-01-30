package commonlibrary.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj 2015��8��21��
 * @Description: ��ʽ�����ڲ���---SimpleDateFormat---sdf1parse(strDate)---sdf2.format(d)
 */
public class DateDemo05 {
	public static void main(String[] args) {
		//��ȡ��ǰʱ�䲢ת�����ַ���
		DateFormat df = DateFormat.getDateTimeInstance();
		String str = df.format(new Date()).toString();    //2015-8-21 15:09:37
		
		//��һ��ģ�棬���ַ�������ȡ��������
		String pat1 = "yyyy-MM-dd HH:mm:ss";
		//�ڶ���ģ�棬����ȡ����������ֱ��ָ���ĸ�ʽ
		String pat2 = "yyyy��MM��dd��HHʱmm��ss��";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d = null;
		try {
			d = sdf1.parse(str);  // ��ȡ����
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));  //�����ڱ���µĸ�ʽ
	}
}
