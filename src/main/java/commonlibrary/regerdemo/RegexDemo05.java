package commonlibrary.regerdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lfj  2015��8��28��
 * @Description: ������ʽ---��ȫ���������滻�ɡ�_��
 */
public class RegexDemo05 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";       //���ֿ��Գ���һ�λ���
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		String newStr = m.replaceAll("_"); //�滻����
		System.out.println(newStr);
	}
}
