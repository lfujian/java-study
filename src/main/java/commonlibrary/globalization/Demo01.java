package commonlibrary.globalization;

import java.util.ResourceBundle;

/**
 * @author lfj  2015��8��19��
 * @Description: ���ʻ�---ResourceBundle---getBundle �õ���Դ�ļ�---getString ��ȡ��������
 */
public class Demo01 {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println("���ݣ�"+rb.getString("info"));
	}
}
/**
 * ������src �� �½��ļ� Message.preperties  ����Ϊ�� info = HELLO 
 * 
 */