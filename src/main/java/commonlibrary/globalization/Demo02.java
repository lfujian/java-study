package commonlibrary.globalization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author lfj  2015��8��19��
 * @Description: ���ʻ�---����---Locale ���ڱ�ʾһ������������
 */
public class Demo02 {
	public static void main(String[] args) {
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		
		System.out.println("���ģ�"+zhrb.getString("info"));
		System.out.println("Ӣ�ģ�"+enrb.getString("info"));
		System.out.println("���ģ�"+frrb.getString("info"));
	}
}
/**
 * ��src �� �½��ļ� Message_en_US.properties    info = \u4f60\u597d\uff01  ���������ļ�����
 * 
 */