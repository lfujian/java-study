package commonlibrary.globalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author lfj  2015��8��19��
 * @Description: ���ʻ�---����---MessageFormat ��ʽ����̬�ı�
 */
public class Demo03 {
	public static void main(String[] args) {
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		//���ζ�ȡ���������ļ������ݣ�ͨ����ֵ��ȡ
		String str1 = zhrb.getString("info");
		String str2 = enrb.getString("info");
		String str3 = frrb.getString("info");
		System.out.println("���ģ�"+MessageFormat.format(str1, "����"));//���ö�̬�ı�������
		System.out.println("Ӣ�ģ�"+MessageFormat.format(str2, "laoli"));
		System.out.println("���ģ�"+MessageFormat.format(str3, "laoli"));
	}
}
/**
 * ��src �� �½��ļ� Message_en_US.properties  ���� ��info = Hello,{0}!
 * 
 */