import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9
        //生成1~100的所有数字
        int m = 0;
        for (int i = 1; i <= 100; i++) {
            if(i/10==9){
                m++;
            }
            if(i%10==9){
                m++;
            }
        }
        System.out.println(m);
    }
    public static void main11(String[] args) {
        //输出1000~2000 之间的所有闰年
        //生成1000~20000的所有年份
        for (int i = 1000; i <= 2000; i++) {
            //判断闰年
            if(i % 4 == 0 && i % 100 != 0){
                System.out.println(i);
            } else if (i % 400 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main10(String[] args) {
        //打印素数1~100
        //生成1~100的所有数
        for (int i = 1; i <= 100; i++) {
            //判断是不是素数
            int a = 0;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    a++;
                }
            }
            if(a == 0){
                System.out.println(i);
            }
        }
    }
    public static void main9(String[] args) {
        //给定一个数字 判断它是不是素数
        //输入数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //判断是不是素数
        int a = 0;
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                a++;
            }
        }
        if(a == 0){
            System.out.println(num+" 是素数");
        }else {
            System.out.println(num+" 不是素数");
        }
    }
    public static void main8(String[] args) {
     /*   int x = 20;
        if(x == 10){
            System.out.println("hehe");
        }else{
            System.out.println("haha");
        }*/
        int x = 10;
        int y = 20;
        if(x == 20){
            if(y == 10){
                System.out.println("aaa");
            }else{
                System.out.println("bbb");
            }
        }
     /*   Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int year = 1000; year< num; year++){
            if(year%100 != 0){
                if(year % 4 ==0){
                    System.out.println(year + " is leapyear");
                }
            }else{
                if(year % 400 ==0){
                    System.out.println(year + " is leapyear");
                }
            }
        }*/
        //Scanner 工具 System.in 键盘
  /*      Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("oushu");
        }else{
            System.out.println("jishu");
        }*/
        Scanner scanner = new Scanner(System.in);
        int num = scanner .nextInt();
        if(num>0){
            System.out.println("zhengshu");
        } else if (num < 0) {
            System.out.println("fushu");
        }else {
            System.out.println("0");
        }
    }
    public static void main7(String[] args) {
   /*     System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);*/
        int a =1;
    /*  if(a == 1){

        }*/
        int score = 80;
        if(score >= 90){
            System.out.println("优秀");
        }else if (score>=80 && score <90){
            System.out.println("良好");
        }else if (score>=70 && score <80){
            System.out.println("中等");
        }else if (score>=60 && score<70){
            System.out.println("及格");
        }else if (score>=0 && score<60){
            System.out.println("不及格");
        }else {
            System.out.println("错误数据");
        }
    }

    public static void main6(String[] args) {
        int  a = 10;
        int b  = 20;
        int c = a+((b-a)>>1);
        System.out.println(c);
    }
    public static void main5(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println( b>6);
        System.out.println(a<5 || a/0 != 0);
        System.out.println(!(a<5));
    }

    public static void main4(String[] args) {
        //System.out.println(10>20&10/0==0); 程序抛出异常
        //System.out.println(10<20 | 10>0); 程序抛出异常
        /*int a = 1;
        int b = 10;
        double c = a>b?1:2.0;
        b = 10;
        System.out.println(c);*/
    }
    public static void main3(String[] args) {
        int a = 11;
        int b = 12;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a>=b);
        System.out.println(a == b);
        System.out.println();
       /* if(5<a<10){

        }*/
        a = ++a;
        System.out.println(a);
    }
    public static void main2(String[] args) {
        int a = 10;
        //int b = a++;//b = a; a = a+1;
        //int b = ++a;//a = a+1; b= a;
       // System.out.println(b);
        a = a++;
        System.out.println(a);
    }
    public static void main1(String[] args) {
        //int a = 11;
        //a = a + 1;
        //a += 1；
        //System.out.println(a);
        double d = 12.5;
        //a = (int)(a+d);
        //a += d;//他是可以自动帮我们进行类型分类的
        //System.out.println(a);


        //System.out.println(10/0);
        /*System.out.println(-12.5%10.5);
        System.out.println(11%10.5);*/
       /* System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1*/
/*        System.out.println(5/2);//2
        System.out.println(5.0/2);//2.5
        System.out.println(5/2.0);//2.5
        System.out.println((float)5/2);//2.5
        System.out.println(5/(float)2);//2.5
        System.out.println((float)(5/2));//2.0*/

       /* System.out.println("\"hello\"");
        System.out.println("\\");
        System.out.println("\\\"hello\\\"");
        short a = 128;
        //byte b = (byte) a;
        System.out.println(a + "" + b);*/


        double x = 2.0;
        int y = 4;
        x/=++y; //x= x/++y;
    /*    byte a = 130;
        float b = 3.5F;*/
        System.out.println(x);
    }
}
