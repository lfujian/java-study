package commonlibrary.regerdemo;

/**
 * @author lfj  2015��8��28��
 * @Description: String���������ʽ��֧��
 */
public class RegexDemo06 {
	public static void main(String[] args) {
		String str = "A1B22C333D4444E55555F".replaceAll("\\d+", "_"); //�ַ����滻
		boolean temp = "2015-08-28".matches("\\d{4}-\\d{2}-\\d{2}"); //�ַ���ƥ��
		String s[] = "A1B22C333D4444E55555F".split("\\d+"); //�ַ�������
		System.out.println("�滻��"+str);
		System.out.println("ƥ����֤��"+temp);
		System.out.print("��֣�");
		for (int i=0;i<s.length;i++) {
			System.out.print(s[i]+"\t");
		}
	}
}
