import java.util.Scanner;
import java.util.*;
public class test {
/*    public static void main(String[] args) {
        double a = 47.63/10;
        double b = 47.6%10/1;
        System.out.println("%lf ",a);
        System.out.println(b);
    }*/
public static void main1(String[] args){
    double P = 3.1415926;
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    double s;
    s = r*r*P;
    System.out.println("The area for the circle of radius"+ r +"is"+s);
}



            public static void main2(String[] args) {
             /*   System.out.print(100%3);
                System.out.print(",");
                System.out.println(100%3.0);*/
                //int i=1+1/2+1/4;
                boolean a = false;
                boolean b = true;
                boolean c = (a && b) && (!b);
                boolean result = (a & b) & (!b);
                System.out.println(c);
                System.out.println(result);
            }

    public static void main(String[] args) {



                Scanner reader = new Scanner(System.in);
                float x = reader.nextFloat();
                int a = (int)x/10;             //十元纸
                int b = ((int)x%10)/5;         //五元纸
                int c= ((int)x%10)-5;          //一元纸币

                float d= x%1*100;              //小数部分乘100, 便于计算
                int e = (int)d/50;             //五角硬币数量
                int f = ((int)d%50)/10;        //一角硬币数量
                int g = ((int)d%50)%10/2;      //贰分硬币数量
                int h= 2*g%2;                  //壹分硬币数量

                System.out.println(a+ "张十元");
                System.out.println(b+ "张五元");
                System.out.println(c+ "张一元");
                System.out.println(e+"个五角");
                System.out.println(f+"个一角");
                System.out.println(g+"个贰分");
                System.out.println(h+"个壹分");
            }
        }


