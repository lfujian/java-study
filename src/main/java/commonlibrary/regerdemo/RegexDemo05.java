package commonlibrary.regerdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lfj  2015年8月28日
 * @Description: 正则表达式---将全部的数字替换成“_”
 */
public class RegexDemo05 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";       //数字可以出现一次或多次
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		String newStr = m.replaceAll("_"); //替换数字
		System.out.println(newStr);
	}
}
