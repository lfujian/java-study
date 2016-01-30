package commonlibrary.regerdemo;

import java.util.regex.Pattern;

/**
 * @author lfj  2015年8月28日
 * @Description: 按照字符串的数字将字符串拆分
 */
public class RegexDemo04 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";       //数字可以出现一次或多次
		Pattern p = Pattern.compile(pat);
		String s[] = p.split(str); 	//进行字符串拆分
		for (int x=0;x<s.length;x++) {
			System.out.print(s[x]+"\t");
		}
	}
}
