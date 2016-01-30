package commonlibrary.comparademo;

/**
 * @author lfj  2015年8月21日
 * @Description: 对Object数组进行排序，对象所在的类必须实现Comparable接口
 *   使用比较器进行排序操作
 */

public class ComparableDemo01 {
    public static void main(String[] args) {
        Student stu[] = { new Student("张三", 20, 90.0f),
                new Student("李四", 22, 90.0f), new Student("王五", 20, 99.0f),
                new Student("赵六", 20, 70.0f), new Student("孙七", 22, 100.0f) };
        java.util.Arrays.sort(stu);
        for (int i = 0 ; i <stu.length; i++){
            System.out.println(stu[i]);
        }
    }
}

class Student implements Comparable<Student> {  // public interface Comparable<T> { }
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String toString() {
        return name + "\t\t" + age + "\t\t" + score;
    }
    //覆写compareTo()方法，返回值只能是1（表示大于）、-1（表示小于）、0（表示等于）
    public int compareTo(Student stu) {//先按分数从上到下，相同时再按年龄
        if (this.score > stu.score) {
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            if (this.age > stu.age) {
                return -1;
            } else if (this.age < stu.age) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}