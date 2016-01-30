package commonlibrary.globalization;

import java.util.ResourceBundle;

/**
 * @author lfj  2015年8月19日
 * @Description: 国际化---ResourceBundle---getBundle 得到资源文件---getString 获取具体内容
 */
public class Demo01 {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println("内容："+rb.getString("info"));
	}
}
/**
 * 必须在src 下 新建文件 Message.preperties  内容为： info = HELLO 
 * 
 */