package commonlibrary.numberdemo;

import java.text.DecimalFormat;

/**
 * @author lfj  2015��8��21��
 * @Description: ��ʽ������  (������#����0)---DecimalFormat ��ʽ�����֣����Զ���ķ�ʽ
 */
public class Demo02 {
	public static void main(String[] args) {
		FormatDemo demo = new FormatDemo();
		demo.format1("###,###.###", 111222.34567);  //��ͨ
		demo.format1("000,000.000",11222.34567);			//����
		demo.format1("###,###.###��", 111222.34567);  //���ַ�
		demo.format1("000,000.000��",11222.34567);
		demo.format1("##.###%", 0.345678);			//�ٷ���ʾ
		demo.format1("00.000%", 0.345678);
		demo.format1("###.###\u2030", 0.345678);		//ǧ����ʾ
	}
}

class FormatDemo{
	public void format1(String pattern,double value){
		DecimalFormat df = null;
		df  = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println("ʹ��"+pattern+"��ʽ������"+value+"--"+str);
	}
	
}