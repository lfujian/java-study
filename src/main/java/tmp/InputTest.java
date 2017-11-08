package tmp;

import java.util.Scanner;

/**
 * @author lfj 2017年3月11日
 * @Description: 标准输入
 */
public class InputTest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("name?");
        String name = in.nextLine();

        System.out.println("age?");
        int age = in.nextInt();

        System.out.println("name:" + name + ",age:" + age);
    }
}
