package commonlibrary.runtime;

import java.io.IOException;

/**
 * @author lfj  2015��8��19��
 * @Description: �� Runtime�� ���ñ����еĳ��� ���رճ���
 */
public class Demo02 {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		Process pro = null;
		try {
			pro = run.exec("notepad.exe"); //�������±�����
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);                  //�ȴ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pro.destroy();						//֮���������
	}
}
