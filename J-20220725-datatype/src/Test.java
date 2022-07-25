import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        String str = a + "";
        //System.out.ptintln(str)
        //借助方法
        String ret = String.valueOf(10);
        System.out.println(ret);
    }
    public static void main15(String[] args) {
        String str = "1234";
        int a = Integer.parseInt(str);
        System.out.println(a+1);

        a = Integer.valueOf(str);
        System.out.println(a+8);
    }
    public static void main14(String[] args) {
        String s = "hello";
        System.out.println(s);
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println("a:"+a  + "b:"+b);
        System.out.println("a:"+a+b);
        System.out.println(a+b+"likaixuan");

        String s1 = "hello";
        String s2 = "world";

        System.out.println(s1 + s2);
    }
    public static void main13(String[] args) {
       /* int a = 10;
        long b = 20;
        //int c = (int)(a+b);
        long c = a + b;

        System.out.println(c);
        */
        byte a = 127;
        byte b = 127;
        //当你参与运算的数据
        //byte c = (byte) (a+b);
        int c = a+b;
        System.out.println(c);
    }
    public static void main12(String[] args) {

        /*boolean flg = true;
        int a = 1;
        flg = (boolean) a;
         */
        int a = 97;
        char ch = (char)a;

        double d = 97.9;
        char ch2 = (char) d;

        System.out.println(ch);
        System.out.println(ch2);
    }
    public static void main11(String[] args) {
        int a = 10;//4
        long b = 100L;//8
        //a = (int)b;//不能进行直接赋值 强制类型转换->盖章子 显示
        b = a;
        //System.out.println(a);
        System.out.println(b);
    }
    public static void main10(String[] args) {
        boolean b = false;
        System.out.println(b);
        //shift+f10
    }
    public static void main9 (String[] args) {
        //字符型 2个字节 16个比特位 没有负数 a-》97 A:65
        char ch = 'a';
        System.out.println(ch);
        //System.out.println(Character.MAX_RADIX);
        //System.out.println(Character.MIN_RADIX);

    }
    public static void func4(String[] args){
        double a = 1.1;
        double b = 1.1;
        System.out.println(a / b);
        System.out.println(a*b);
    }
    public static void main8(String[] args) {
        /**
         * 双精度浮点型：8个字节
         */
        double d = 12.5;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        float f = 12.5f;
        System.out.println(f);
    }
    public static void main7(String[] args) {
        /**
         * 字节类型 -》 1个字节 - 》8 个比特位 --》 7--》   -2^7    (2^7)-1
         * -128 - 127
         * -128......-1,0,1........127 256个数字
         */
        byte b = 10;
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
    public static void main6(String[] args) {
        /**
         * 短整型 2个字节 =》 16比特位 -》15byte -》-2^15   (2^15)-1
         */
        short sh = 10;
        System.out.println(sh);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
    public static void main5(String[] args) {
        /**
         * 8个字节 -》 64比特位 -》63bit -》 -2^63    (2^63) - 1
         */
        long a = 10;
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        long b = 10L;
        System.out.println(b);
    }
    public static void main4(String[] args) {
        //局部变量 4个字节
        int a = 10;
        System.out.println(a);
        //Integer -> 把他当作“一个int 的plus版本”  专业术语： 包装类 后面会学习
        System.out.println(Integer.MAX_VALUE);//Integer.MAX_VALUE 这样可以输入int的最大值
        System.out.println(Integer.MIN_VALUE);//会输出 int的最小值

        int c = 2147483647;
        System.out.println(c);
    }
    public static void main2(String[] args) {
        System.out.println("hello");
        System.out.println(10);
        System.out.println(10.5);
        System.out.printf("%s\n","likaixuan");
        System.out.printf("%d\n",10);
        System.out.print(10);
        System.out.print("hanghuangmei");
        System.out.printf("%d",10);
        System.out.print("hanghuangmei");
    }
    public static void main1(String[] args) {
        int a = 10;
        int ___ = 100;
        System.out.println(___);

        int ____ = 100;
        System.out.println(____);

        int ______ = 100;
        System.out.println(______);

        int __ = 100;
        System.out.println(__);
    }
}
