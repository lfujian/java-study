package commonlibrary.numberdemo;

import java.text.NumberFormat;

public class Demo01 {
	public static void main(String[] args) {
		NumberFormat nf = null;
		nf = NumberFormat.getInstance();
		System.out.println("��ʽ��֮������֣�"+nf.format(1000000));
		System.out.println("��ʽ��֮������֣�"+nf.format(1000.234231));
	}
}
