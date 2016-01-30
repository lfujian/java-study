package commonlibrary.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author lfj  2015��8��21��
 * @Description: ���һ��ȡ�����ڵ��࣬�������ȡ��ϵͳ�ĵ�ǰʱ���ʱ���
 * 						    ����д��̫����̫���ӣ�Ӧ����SimpleDateFormatʵ��
 */
public class DateDemo06 {
	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println("ϵͳʱ��: "+dt.getDate());
		System.out.println("��ǰʱ��: "+dt.getDateComplete());
		System.out.println("ʱ���: "+dt.getTimeStamp());
	}

}

class DateTime {
	private Calendar calendar = null ; //����һ��Calendar���󣬿���ȡ��ʱ��
	public DateTime() {
		this.calendar = new GregorianCalendar();  //ͨ��Calendar�������ʵ����
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
	
	//�õ�����������
	public String getDateComplete(){
		StringBuffer buf= new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("��");
		buf.append(this.addZero(calendar.get(Calendar.MONTH)+1, 2));
		buf.append("��");
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append("�� ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		buf.append("ʱ");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append("��");
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append("��");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		buf.append("����");
		return buf.toString();
	}
	
	//�õ�ʱ���
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
	
	//����
	private String addZero(int num,int len){
		StringBuffer s = new StringBuffer();
		s.append(num);
		while(s.length()<len){
			s.insert(0, "0");
		}
		return s.toString();
	}
}