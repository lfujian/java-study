package commonlibrary.regerdemo;

import java.util.regex.Pattern;

/**
 * @author lfj  2015��8��28��
 * @Description: �����ַ��������ֽ��ַ������
 */
public class RegexDemo04 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F";
		String pat = "\\d+";       //���ֿ��Գ���һ�λ���
		Pattern p = Pattern.compile(pat);
		String s[] = p.split(str); 	//�����ַ������
		for (int x=0;x<s.length;x++) {
			System.out.print(s[x]+"\t");
		}
	}
}
