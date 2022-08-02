import java.util.Scanner;

public class Test {
    public static int comp(int a,int b,int c){
        int tmp = a>b?a:b;
        return tmp>c?tmp:c;
    }
    public static int comp(int a,int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        int a = 11;
        int b = 14;
        int c = 8;
        int ret = comp(a,b);
        System.out.println(ret);


        int ret2 = comp(a,b,c);
        System.out.println(ret2);
    }
    public static int sum5(int a,int b){
        return a+b;
    }
    public static double sum5(double a,double b,double c){
        return a+b+c;
    }

    public static void main28(String[] args) {
        int a = 12;
        int b = 13;
        int ret = sum5(a,b);
        System.out.println(ret);

        double x = 11.1;
        double y = 12.1;
        double z = 13.1;
        double ret2 = sum5(x,y,z);
        System.out.println(ret2);
    }
        public static int fib (int n) {
            if (n <= 2) {
                return 1;
            }
            else {
                return (fib(n - 1) + fib (n - 2));
            }
        }
        public static void main27 (String args[]) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = fib(a);
            System.out.println(b);
        }

    public static void main26(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int s = 1;
            for (int j = 1; j <= i; j++) {

                s *= j;
            }

            sum += s;
        }
        System.out.println(sum);
    }
    public static int sum2(int n){
        if (n == 1){
            return 1;
        }
        return n*fuc2(n-1);
    }
    public static void main25(String[] args) {
        System.out.println(sum2(6));
    }
    public static int fuc2(int n){
        if (n == 1){
            return 1;
        }
        return n * fuc2(n-1);
    }
    public static void main24(String[] args) {

        System.out.println(fuc2(5));;
    }
    public static int max2(int a,int b){
        return a>b?a :b;
    }
    public static int max3(int a,int b,int c){
        int ret = max2(a,b);
        return ret>c?ret:c;
    }
    public static void main23(String[] args) {
        System.out.println(max3(11,15,6));
    }
    public static double sum (double a,double b,double c){
        return a+b;
    }
    public static double sum(double b,int a,int c){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main22(String[] args) {
        int a = 10;
        int b = 20;
        int ret = sum(a,b);
        System.out.println(ret);

        double d1 = 12.3;
        double d2 = 12.5;
        double ret2 = sum(d1,d2);
        System.out.println(ret2);
    }
    public static void main21(String[] args) {
        int [] arr = {10,20};
        swap(arr);
        System.out.println("arr[0] = "+ arr[0]+" arr[1] = "+arr[1]);
    }
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main19(String[] args) {
        int a =10;
        int b = 20;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
    public static int fac(int n){
        int ret = 1;
        for (int i = 1; i <=n ; i++) {
            ret *= i;
        }
        return ret;
    }
    public static int facSum(int n){
        int sum  =0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }
    public static void main18(String[] args) {
        int rt = facSum(5);
        System.out.println(rt);
    }
    public static void add2(int a,int b){
        System.out.println(a+b);
    }
    public static void main17(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("第一次调用方法之前");
        int ret = add(a,b);
        System.out.println("第一次调用方法之后");
        System.out.println("ret = "+ ret);

        System.out.println("第二次调用方法之前");
        ret = add(30,50);
        System.out.println("第二次调用方法之后");
        System.out.println("ret = "+ret);
    }
    public static int add(int a,int b){
        System.out.println("调用方法 a= "+a+"b = "+b);
        return a+b;
    }
    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String n = scanner.next();
            int age = scanner.nextInt();
            System.out.println(n+" "+age);
        }
    }
    public static void main14(String[] args) {
        int a = 18;
        int b = 24;
        int c = a % b;
        while (c != 0){
            a = b;
            b = c;
            c = a%b;
        }
        System.out.println(b);
    }
    public static void main13(String[] args) {
        for (int n = 1; n <= 100; n++) {
            int i = 2;
            for (; i<Math.sqrt(n); i++){
                if (n % i == 0){
                    System.out.println(n+"不是素数");
                    break;
                }
                if(i > Math.sqrt(n)){
                    System.out.println(n+ "是素数");
                }
            }
        }
    }
    public static void main12(String[] args) {
        int n = 11;
        int i = 2;
        for (; i <= n/2; i++){
            if (n % i == 0 ){
                System.out.println("不是素数");
                break;
            }
        }
        if (i > n/2){
            System.out.println("是素数");
        }
    }
    public static void main11(String[] args) {
        int n = 9;
        int i = 2;
        for (; i < n; i++) {
            if (n % i == 0){
                System.out.println("不是素数");
                break;
            }
        }
        if (i == n){
            System.out.println("是素数");
        }
    }
    public static void main10(String[] args) {
        int n = 7;
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n>>i)&1)+"");
        }//偶数
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n>>i)&1)+"");
        }
    }
    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0){
            System.out.println("请输入你的密码，共有"+count+"次机会");
            String pass = scanner.nextLine();
            if(pass.equals("123")){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("登陆失败");
            }
            count--;
        }
    }
    public static void main8(String[] args) {
        int n = 123;
        while (n != 0){
            System.out.println(n%10);
            n /= 10;
        }
    }
    public static void main7(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+""+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((i==j) || (i+j == n-1)){
                        System.out.print('*');
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main5(String[] args) {
        for (int i = 1; i <= 999999; i++) {
            int count = 0;
            int tmp = i;
            int sum = 0;
            while (tmp != 0){
                tmp /= 10;
                count++;
            }
            //count 里就存储了当前的数字i是第几位
            tmp = i;
            while(tmp != 0){
                sum += Math.pow(tmp%10,count);
            }
            //sum就存储了和
            if(sum == i){
                System.out.println(sum);
            }
        }
    }
    public static void main4(String[] args) {
        double sum = 0.0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
    public static void main3(String[] args) {
        int n = -1;
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main2(String[] args) {
        int n = 15;
        int count = 0;
        while (n != 0){
            if ((n & 1) != 0) {
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }
    public static void main1(String[] args) {
        int n = -1;
        int count = 0;
        for(int i = 0; i<32; i++){
            if(((n>>i)& 1)!= 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
