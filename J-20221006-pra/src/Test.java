import java.util.Scanner;

public class Test {
/*    public static void main1(String[] args) {
*//*
            int a = 10;
            int b = 20;
            String s1 = "hello";
            String s2 = " world";
            System.out.println(a+b);
            System.out.println("a:"+a+" b:"+b);
            System.out.println("a:"+a+b);
            System.out.println(a+b+ "likaixuan");
            System.out.println(s1+s2);
*//*
//            String str = "1234";
//            int a = Integer.parseInt(str);
//            System.out.println(a+1);
    }


    public static void main2(String[] args) {
*//*        int a=2,b=8,c=6;
        String s = "abc";
        System.out.println(a+b+s+c);
        System.out.println();*//*
*//*        float f=1.3;
        char c ="a";

        byte b=257;
        int i=10;*//*
        int i=1+1/2+1/4;
        System.out.println(i);
    }

    public static void main3(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = (a && b) && (!b);
        boolean result = (a & b) & (!b);
        System.out.println(c);
        System.out.println(result);
    }*/
/*int ipow(int base, int exp) {
    int result = 1; while (exp) {
        if (exp & 1)
            result *= base;
        exp >>= 1;
        base *= base;}
    return result;
}*/
    public static void main3(String[] args){

                Scanner input=new Scanner(System.in);
                double a = input.nextDouble() ;
                int n = input.nextInt();
                double r = input.nextDouble();
                double s;
                s = a*Math.pow(1+r,n)-a;
                System.out.println("s="+s);
    }

    public static void main4(String[] args) {
        int x,i;
        for (i = 1; i <= 50; i++) {
            x = i;
            if(x%2 == 0)
                if(x%3 == 0)
                    if(x%7 == 0)
                        System.out.println(i);
        }
    }

    public static void main5(String[] args) {
        int i=0, j=-1;
        switch(i)  {
            case 0:  j=1;
            case 2:  j=2;
            default: j=5;
        }
        System.out.print("j="+j);

    }

    public static void main6(String[] args) {
                int c = 0, k;
                for(k=1; k<3; k++)
                    switch( k ){
                        default: c += k;
                        case 2: c++;
                        break;
                        case 4: c += 2;
                        break;
                    }
                System.out.println(c);
    }

    public static void main7(String[] args) {

                String str = "" ;
                for (int x = 0 ; x < 5 ; x ++) {
                    str += x ;
                }
                System.out.println(str) ;
    }

    public static void main8(String[] args) {
/*
        int y = 0;
        for (int i = 0; i<10; ++i) {
            y += i;
            System.out.println(i);
*/
        int i, j, m=55;
        for(i=1; i<=3; i++)
            for(j=3; j<=i; j++)
                m = m%j;
        System.out.printf("%d\n", m);

        }

    public static void main9(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.next();//此行语句有错误，改正后填到下侧空格内

        int n = sc.nextInt();
        //System.out.println(fun(int n));//此行语句有错误，改正后填到下侧空格内

        System.out.println(fun(n));
    }
    //public int fun(int num)//此行语句有错误，改正后填到下侧空格内
/*    public static int fun(int num){

        //int k;//此行语句有错误，改正后填到下侧空格内
        int k = 1;

        do{
            k=k*(num%10);
            //num\=10;//此行语句有错误，改正后填到下侧空格内
            num /= 10;

        }while(num>0);
        return k;
    }*/

    public static void main10(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextDouble();//此行语句有错误，改正后填到下侧空格内
        int n=sc.nextInt();
        double x=fun(n);
        System.out.printf("%f",x);
    }
    //public static void fun(int m)//此行语句有错误，改正后填到下侧空格内
    public static double fun(int m)
    {
        double t=1;
        int i;
        //for(i=2;i<m;i++)//此行语句有错误，改正后填到下侧空格内
        for(i=2;i<=m;i++)
        {
            //t=t-1/(i*i);//此行语句有错误，改正后填到下侧空格内
            t = t - (1/(i*i)*1.0);
        }
        //return i;//此行语句有错误，改正后填到下侧空格内
        return t;

    }
    public static void main11(String[] ager){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y;
        if(x < 5){
            y = x + 5;
        }else if(5<=x && x<10){
            y = x*x + 0.3*x;
        }else{
            y = 5*x - 10;
        }
        y = Math.round(y);
        System.out.println("y="+y);

    }

    public static void main12(String[] args) {


                Scanner input = new Scanner(System.in);
                int x = input.nextInt();
                int y = input.nextInt();
                int sum = 0;
                int tmp;
                if(x < y){
                    tmp = x;
                    x = y;
                    y = tmp;
                }
                if(y%2 == 0){
                    for(int i = y;i<=x;i++){
                        sum += i;
                        i += 2;
                    }
                }else{
                    for(int i = y;i<=x;i++){
                        sum += i;
                        i += 1;
                    }
                }
                System.out.println("SUM = "+sum);
            }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = 0;
        for(int i = 1; i<=n; i++){
            if((i%3==0)&&(i%5 ==0)){
                System.out.printf("%d ",i);
                s++;
                if(s>=9){
                    System.out.println();
                }
            }
        }
    }
}