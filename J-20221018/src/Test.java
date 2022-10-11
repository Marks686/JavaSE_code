import java.util.*;
public class Test {
    public static void main1(String[] args) {
        int result = 0;
        int i = 2;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        System.out.println(result);
    }

    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        switch(m) {
            case 0: System.out.println("case 0");
            case 1: System.out.println("case 1");break;
            case 2:
            default:System.out.println("default");
        }
    }

    public static void main(String[] args) {
/*        double temperature = 50;
        if (temperature >= 100)
            System.out.println("too hot");
        else if (temperature <= 40)
            System.out.println("too cold");
        else
            System.out.println("just right");*/
  /*      int y = 0;
        for (int i = 0; i<10; ++i) {
            y += i;
        }*/
/*        int i = 0;
        for(i=4; i>0; i--) {
            if(i==2)
                break;
            System.out.print(i);
        }
        System.out.print(i);*/
/*        for (int i = 0; i < 10; i++) {
            if (i == 10 - i) {
                break;
            }

            if (i % 3 != 0) {
                continue;
            }*/
/*        int i = 1;
        int a ;
        a = i++ +1;

        System.out.println(a);
        System.out.println(i);*/
/*
        int count = 0;
        do {
            System.out.println("Welcome to Java");
        } while (count++ < 10);
*/
 /*       boolean code = 1234567890126;

        int sum = 0;
        for(int i=0;i<5; i++){
            sum += code / 100 % 10;
            code = code /100;
        }*/
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        for(int i = 0; i < y; i++){
            System.out.println(i+" ");
        }
        for(int j = y; j > 0; j--){
            System.out.println(j+" ");
        }
    }
}
