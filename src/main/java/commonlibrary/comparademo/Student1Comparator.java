package commonlibrary.comparademo;

import java.util.Comparator; //public interface Comparator<T> {     int compare(T o1, T o2); boolean equals(Object obj);}

/**
 * @author lfj  2015年8月22日
 * @Description: 定义比较规则
 */
/**
 * 如果一个类开发完成，但并没有实现Comparable接口，将无法进行对象排序操作， 
 * 解决方式：使用另一个比较器的接口操作---Comparator---是Comparable的补救方法
 * 用法：需要单独指定好一个比较器的比较规则才可以进行排序
 */
public class Student1Comparator implements Comparator<Student1>{ //实现比较器接口

	public int compare(Student1 s1, Student1 s2) {  //为学生类定义比较规则
		if (s1.equals(s2)) {											//如果相等，则返回0
			return 0;
		} else if (s1.getAge()<s2.getAge()) {         //按年龄比较
			return 1;
		} else {
			return -1;
		}
	}

}
