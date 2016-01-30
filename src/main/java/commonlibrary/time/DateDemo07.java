package commonlibrary.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lfj  2015��8��21��
 * @Description: ��SimpleDateFormatʵ��һ��ȡ�����ڵ��࣬�������ȡ��ϵͳ�ĵ�ǰʱ���ʱ���
 */
public class DateDemo07 {
	public static void main(String[] args) {
		DateTime1 dt = new DateTime1();
		System.out.println("ϵͳʱ��: "+dt.getDate());
		System.out.println("��ǰʱ��: "+dt.getDateComplete());
		System.out.println("ʱ���: "+dt.getTimeStamp());
	}

}

class DateTime1 {
	//�������ڸ�ʽ����������ֱ�Ӷ�new Date()����ʵ����
	private SimpleDateFormat sdf = null ;
	//�������ʱ�䣨Ӣ�ģ�
	public String getDate(){
		this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		return this.sdf.format(new Date());
	}
	//�������ʱ�䣨���ģ�
	public String getDateComplete(){
		this.sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��SSS����");
		return this.sdf.format(new Date());
	}
	//���ʱ���
	public String getTimeStamp(){
		this.sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return this.sdf.format(new Date());
	}
}




