package commonlibrary.time;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author lfj 2015��8��20��
 * @Description: ��ʽ�����ڲ���---DateFormat.getDateInstance
 */
public class DateDemo04 {
	public static void main(String[] args) {
		DateFormat df1 = null; // ����������
		DateFormat df2 = null;
		df1 = DateFormat.getDateInstance(); // ȡ������
		df2 = DateFormat.getDateTimeInstance(); // ����ʱ��
		System.out.println("Date��" + df1.format(new Date())); // Date��2015-8-20
		System.out.println("DateTime��" + df2.format(new Date())); // DateTime��2015-8-20
																	// 17:53:49

		// ��ʾָ���ķ��
		DateFormat df3 = null; // ����������
		DateFormat df4 = null;
		df3 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale(
				"zh", "CN")); // ȡ�����ڣ�������������ʾ���
		df4 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD,
				DateFormat.ERA_FIELD, new Locale("zh", "CN")); // �������ں�ʱ�����ʾ��ʽ
		System.out.println("----------------��ʾָ���ķ��---------------------");
		System.out.println("Date��" + df3.format(new Date())); // Date��2015��8��20��
		System.out.println("DateTime��" + df4.format(new Date())); //DateTime��2015��8��20�� ����05ʱ58��43�� CST
																	// 17:53:49s
	}
}
