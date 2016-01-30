package commonlibrary.globalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author lfj  2015年8月19日
 * @Description: 国际化---范例---MessageFormat 格式化动态文本
 */
public class Demo03 {
	public static void main(String[] args) {
		Locale zhLoc = new Locale("zh","CN");
		Locale enLoc = new Locale("en","US");
		Locale frLoc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhLoc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enLoc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frLoc);
		//依次读取各个属性文件的内容，通过键值读取
		String str1 = zhrb.getString("info");
		String str2 = enrb.getString("info");
		String str3 = frrb.getString("info");
		System.out.println("中文："+MessageFormat.format(str1, "老李"));//设置动态文本的内容
		System.out.println("英文："+MessageFormat.format(str2, "laoli"));
		System.out.println("法文："+MessageFormat.format(str3, "laoli"));
	}
}
/**
 * 在src 下 新建文件 Message_en_US.properties  内容 ：info = Hello,{0}!
 * 
 */