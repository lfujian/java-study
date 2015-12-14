package io.execdemo;

/**
 * @author lfj  2015年12月14日
 * @Description: 输入数据，完成数据校验，以及相加
 */
public class ExecDemo02 {
    public static void main(String[] args) throws Exception{
        int i = 0;
        int j = 0;
        InputData input = new InputData();
        i = input.getInt("请输入第一个数字：", "输入的数据必须是数字，请重新输入！");
        j = input.getInt("请输入第二个数字：", "输入的数据必须是数字，请重新输入！");
        System.out.println(i + "+" + j + "=" + (i+j));
    }
}
