package commonlibrary.regerdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lfj 2015年8月28日
 * @Description: 验证一个字符串是否是指定的格式
 */
public class RegexDemo03 {
	public static void main(String[] args) {
		String str = "2015-08-28";
		String pat = "\\d{4}-\\d{2}-\\d{2}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		if (m.matches()) {
			System.out.println("日期合法");
		} else {
			System.out.println("日期不合法");
		}
	}
}
