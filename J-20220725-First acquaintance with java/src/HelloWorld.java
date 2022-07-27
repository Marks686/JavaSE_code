import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("\\\"hello\\\"");
    }
    public static void main19(String[] args) {
        String str = "1234";
        int a = Integer.parseInt(str);
        System.out.println(a+1);
    }
    public static void main18(String[] args) {
        int a = 10;
        //想把a变成字符串
        //1,
        String str = a + "";
        System.out.println(str);
        //2.借助方法
        String ret = String.valueOf(10);
        System.out.println(ret);
    }
    public static void main17(String[] args) {
        int a = 10;
        int b = 20;
        String s1 = "hello";
        String s2 = " world";
        System.out.println(a+b);
        System.out.println("a:"+a+" b:"+b);
        System.out.println("a:"+a+b);
        System.out.println(a+b+ "likaixuan");
        System.out.println(s1+s2);
    }
    public static void main16(String[] args) {
        byte a = 10;
        byte b = 20;
        //当你参与运算的数据 小于4个字节
        //会进行提升
        //不建议这样写 byte c =(byte)(a+b)
        int c = a+b;//这样写比较好
        System.out.println(c);
    }

    public static void main15(String[] args) {
        int a = 10;
        long b = 20;
        int c = (int)(a+b);
        long c1 = a+b;
    }
    public static void main14(String[] args) {
        boolean flg = true;
        int a = 1;
       // flg = (boolean)a;
    }
    public static void main13(String[] args) {
        int a = 100;
        long b = 10L;
        b = a;//会自动将a提升为long类型，然后赋值
        System.out.println(b);
    }
    public static void main12(String[] args) {
        int a =10;
        long b = 100L;
        //a = b;大赋值给小
        //不能进行直接赋值
        //需要强制类型转换
        a = (int)b;
        System.out.println(a);
    }
    public static void main11(String[] args) {
        boolean b = true;
        System.out.println(b);
    }
    public static void main10(String[] args) {
        char ch = 'a';
        char ch1 = 97;
        //字符型 2个字节
        // 0~65535
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
    }
    public static void main9(String[] args) {
        float f = 10.5f;
        System.out.println(f);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
    public static void main8(String[] args) {
        double a = 1.1;
        double b =1.1;
        System.out.println(a * b);
    }
    public static void main7(String[] args) {
        double d = 12.5;
        //双精度浮点型 8个字节
        System.out.println(d);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        float f = 12.5f;
        //float f = (float)12.5;
    }
    public static void main6(String[] args) {
        byte b = 10;
        //一个字节  8个比特位、
        //范围： -2^7~(2^7)-1
        System.out.println(b);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }
    public static void main5(String[] args) {
        short sh = 10;
        //短整型 2个字节 ->16个比特位
        //范围 -2^15~(2^15)-1
        System.out.println(sh);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
    public static void main4(String[] args) {
        long a = 10;//long类型是八个字节
        //64个比特位 有一位是符号位
        //数值位 是63个比特位
        //取值范围 -2^63~(2^63)-1
        System.out.println(a);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
    public static void main3(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        //Integer->把他当成一个int的plus版本
        //专业术语：包装类
        int c;
        //System.out.println(c);
        int b =1000;
    }
    public static void main2(String[] args) {
        System.out.println("hello");
        System.out.println(10);
        System.out.println(10.5);
        System.out.printf("%s\n","likaixuan");
        System.out.printf("%d\n",10);

        System.out.print(10);
        System.out.println("likaixuan");
    }
    //第一次使用java
    //main -> psvm
    public static void main1(String[] args) {

        //sout
        System.out.println("hello");

        // 10.sout
        System.out.println(10);
    }
}
