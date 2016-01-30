package commonlibrary.comparademo;

import java.util.Comparator; //public interface Comparator<T> {     int compare(T o1, T o2); boolean equals(Object obj);}

/**
 * @author lfj  2015��8��22��
 * @Description: ����ȽϹ���
 */
/**
 * ���һ���࿪����ɣ�����û��ʵ��Comparable�ӿڣ����޷����ж������������ 
 * �����ʽ��ʹ����һ���Ƚ����Ľӿڲ���---Comparator---��Comparable�Ĳ��ȷ���
 * �÷�����Ҫ����ָ����һ���Ƚ����ıȽϹ���ſ��Խ�������
 */
public class Student1Comparator implements Comparator<Student1>{ //ʵ�ֱȽ����ӿ�

	public int compare(Student1 s1, Student1 s2) {  //Ϊѧ���ඨ��ȽϹ���
		if (s1.equals(s2)) {											//�����ȣ��򷵻�0
			return 0;
		} else if (s1.getAge()<s2.getAge()) {         //������Ƚ�
			return 1;
		} else {
			return -1;
		}
	}

}
