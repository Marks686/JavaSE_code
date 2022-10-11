import java.util.Scanner;
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



            public static void main(String[] args) {
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


    }

