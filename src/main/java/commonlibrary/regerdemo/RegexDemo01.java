package commonlibrary.regerdemo;

/**
 * @author lfj  2015��8��27��
 * @Description: ������ʽ---��ʹ��������ʽ����ͳ�����ж��ַ����Ƿ����������
 */
public class RegexDemo01 {
	public static void main(String[] args) {
		String str = "1234567890";
		boolean flag = true; //���ñ�־λ
		char c[] = str.toCharArray(); //���ַ�������ַ�����
		for (int i = 0; i < c.length; i++) {
			if (c[i]<'0' || c[i]>'9') { // �� ||
				flag = false; 
				break ;
			}
		}
		if (flag) {
			System.out.println("�����������");
		} else {
			System.out.println("�������������");
		}
	}

}
