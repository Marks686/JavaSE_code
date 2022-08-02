import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 5, 6, 9, 8};
            printArray(array);
        }

    public static void main14(String[] args) {
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }
    public static void hanio(int n,char pos1,
                             char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
            return;
        }
        hanio(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanio(n-1,pos2,pos1,pos3);
    }

    public static void move(char pos1,char pos2) {
        System.out.print (pos1+" -> " + pos2+" ");
    }
    public static void main12(String[] args) {
        hanio(4,'A','B','C');
    }
    public static int fuc (int n){
        if (n == 1){
            return 1;
        }
        int tmp = n*fuc(n-1);
        return tmp;

    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        int tmp = n+sum(n-1);
        return tmp;
    }
    public static void print(int n){
        if (n > 9){
            print(n/10);
        }
        System.out.print(n%10 + " ");
    }
    public static int ret(int n){
        if (n > 0){
            return n%10 + ret(n/10);
        }
        return 0;
    }
    public static int fib(int n){
        if (n ==1 || n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }

    }
    public static void main11(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }
/*    public static void print(int n) {
        if(n < 10) {
            System.out.println(n);
            return;
        }
        print(n/10);
        System.out.println(n%10);
    }
//    public static int sum(int n) {
//        if(n < 10) {
//            return n;
//        }
//        int tmp = n%10 + sum(n/10);
//        return tmp;
//    }
*//*    public static int func21(int n) {
        if (n == 1) {
            return 1;
        }
    }*//*
    public static int fib2(int n){
        if (n == 1||n == 2){
            return 1;
        }
        return fib2(n-1)+fib2(n-2);
    }
    public static void main4(String[] args) {

        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(50));
    }
    public static long fib(int n){
        long  f1 = 1;
        long f2 = 1;
        long f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main1(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(50));

    }

    public static void main3(String[] args) {
        System.out.println(fac(5));
    }
    public static int fac(int n){
        if (n ==1){
            return 1;
        }
        int tmp = n*fac(n-1);
        return tmp;
    }
    public static void  function(int a){
        if (a == 1){
            System.out.println(a);
            return;
        }
        function(a - 1);
        System.out.println(a);
    }
    public static void main2(String[] args) {
        function(3);

    }
    *//*public static int max(int a,int b){
        return a > b? a:b;
    }*//*
    public static int max2(int a,int b){
        if(a>b){
            System.out.println(a);
            return a;
        }else {
            System.out.println(b);
            return b;
        }
    }
    public static int max(int a,int b,int c){
        int ret = max(a,b);
        return ret > c?ret:c;
    }*/
}
