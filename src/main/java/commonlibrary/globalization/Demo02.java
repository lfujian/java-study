package commonlibrary.globalization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author lfj  2015年8月19日
 * @Description: 国际化---范例---Locale 用于表示一个国家语言类
 */
public class Demo02 {
	public static void main(String[] args) {
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		
		System.out.println("中文："+zhrb.getString("info"));
		System.out.println("英文："+enrb.getString("info"));
		System.out.println("法文："+frrb.getString("info"));
	}
}
/**
 * 在src 下 新建文件 Message_en_US.properties    info = \u4f60\u597d\uff01  其他两个文件类似
 * 
 */