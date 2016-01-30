package commonlibrary.regerdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lfj 2015��8��28��
 * @Description: ��֤һ���ַ����Ƿ���ָ���ĸ�ʽ
 */
public class RegexDemo03 {
	public static void main(String[] args) {
		String str = "2015-08-28";
		String pat = "\\d{4}-\\d{2}-\\d{2}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		if (m.matches()) {
			System.out.println("���ںϷ�");
		} else {
			System.out.println("���ڲ��Ϸ�");
		}
	}
}
