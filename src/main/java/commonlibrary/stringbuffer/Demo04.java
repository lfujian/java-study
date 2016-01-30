package commonlibrary.stringbuffer;

/**
 * @author lfj  2015��8��19��
 * @Description: StringBuffer---�ַ�����תreverse || �滻-replace||��ȡ-substring ||ɾ��-delete ||����-indexOf ||
 */
public class Demo04 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("world����");
		buf.insert(0, "hello ");
		String str = buf.reverse().toString();
		System.out.println("�ַ�����ת��"+str);
		
		//�滻ָ����Χ������
		StringBuffer buf1 = new StringBuffer();
		buf1.append("123456old9Hello");
		buf1.replace(6, 9, "new");
		System.out.println("�ַ����滻��"+buf1);
		
		//�ַ�����ȡ
		StringBuffer buf2 = new StringBuffer();
		buf2.append("123456old9Hello");
		String str1 = buf2.substring(6,9);
		System.out.println("�ַ�����ȡ��"+str1);
		
		//�ַ���ɾ��
		StringBuffer buf3 = new StringBuffer();
		buf3.append("123456old9Hello");
		String str2 = buf3.delete(6,9).toString();//����ת���ַ���
		System.out.println("�ַ�����ȡ��"+str2);
		
		//�ַ�������
		StringBuffer buf4 = new StringBuffer();
		buf4.append("123456old9Hello");
		if(buf4.indexOf("old")==-1){    //û���ҵ��򷵻�-1
			System.out.println("û���ҵ�ָ������");
		}else{
			System.out.println("����ָ������");
		}
	}
}
