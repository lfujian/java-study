package programmingpearls;

/**
 * @author lfj 2016年1月14日
 * @Description: 移位运算 -- Java提供的位运算符有：左移( << )、右移( >> ) 、无符号右移( >>> ) 、位与( & )
 *               、位或( | )、位非( ~ )、位异或( ^ )，除了位非( ~ )是一元操作符外，其它的都是二元操作符。
 */
public class Demo1 {
    public static void main(String[] args) {
        // 所有的位移运算，都是转化成二进制进行操作
        //5 -- 00000101
        //3 -- 00000011
        //左移
        System.out.println(5 << 2); // 00010100 -- 20
        //右移
        System.out.println(5 >> 2); // 00000001 -- 1
        //无符号右移 --- 正数右移，高位用0补，负数右移，高位用1补，当负数使用无符号右移时，用0进行部位(自然而然的，就由负数变成了正数了)
        System.out.println(5>>3);//结果是0  
        System.out.println(-5>>3);//结果是-1  
        System.out.println(-5>>>3);//结果是536870911 
        //位于 -- 与运算，同1为1，其余为0
        System.out.println(5 & 3);
        //位或 -- 同0为0，其余为一
        System.out.println(5 | 3);//结果为7 
        //异或 -- 异为1，同为0
        System.out.println(5 ^ 3);//结果为6 
        //非 -- 所有位取反
        System.out.println(~5);//结果为-6 
    }
}
