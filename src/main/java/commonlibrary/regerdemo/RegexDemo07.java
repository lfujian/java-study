package commonlibrary.regerdemo;

/**
 * @author lfj  2015��8��28��
 * @Description: һЩ�����ַ�����ʱ��Ҫת��---���������ת��
 */
public class RegexDemo07 {
	public static void main(String[] args) {
		String info = "LFJ:16|TXDY:6|Lee:6";
		String s[] = info.split("\\|");          //�˴����"\\"ת��         s[] = {"LFJ:16","TXDY:66","LI:888"}
		System.out.println("�ַ����Ĳ�֣�");
		for (int x=0;x<s.length;x++) {
			String s2[] = s[x].split(":");
			System.out.println("\t|- "+s2[0]+"\t"+s2[1]);
		}
	}
}
