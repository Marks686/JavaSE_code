import java.util.Scanner;
public class Test {
    public static void main1(String[] args) {
        Scanner input=new Scanner(System.in);
        double a = input.nextDouble() ;
        int n = input.nextInt();
        double r = input.nextDouble();
        double s;
        s = a*Math.pow(1+r,n)-a;
        s=Math.round(s*100)/100.0;
        System.out.println("s="+s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        double c;
        c = 5*(F-32)/9;
        System.out.printf("%.2f",c);
    }
}
