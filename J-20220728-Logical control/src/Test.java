import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值int n;
        double ret = 0.0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                n = -1;
            }else {
                n = 1;
            }
            ret += n*1.0 / i;
        }
        System.out.println(ret);
    }
    public static void main26(String[] args) {
        int n = 7;
        for (int i = 31; i >= 1; i-= 2) {
            System.out.print(((n>>i) & 1)+" ");

        }//偶数
        System.out.println();
        for (int i = 30; i >= 0; i-= 2) {
            System.out.print(((n>>i) & 1)+" ");

        }
    }
    public static void main25(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count  = 3;
        while (count != 0){
            System.out.println("输入密码, 共有"+count+"次机会");
            String pass = scanner.nextLine();
            if (pass .equals("123") ){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("登陆失败");
            }
            count--;
        }
    }
    public static void main24(String[] args) {
        int n = 123;
        while(n != 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }
    public static void main23(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main22(String[] args) {
        int  n = 99;
        int count = 0;
        while (n != 0){
            n = n &(n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void main21(String[] args) {

        //二进制1的个数第二种写法
        int  n = 99;
        int count = 0;
        while(n != 0){
            if((n&1) != 0){
                count++;
            }
            n = n >>> 1;
        }
    }
    public static void main20(String[] args) {
        //二进制1的个数
        int  n = 99;
        int count = 0 ;

        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main19(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100);
        //System.out.println("随机数： "+n);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入你要猜的数字： ");
            int num = scanner.nextInt();
            if (num < n){
                System.out.println("小了");
            } else if (num > n) {
                System.out.println("猜大了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }


    public static void main18(String[] args) {
       //java当中如何生成一个简单的随机数
        Random random = new Random();
        //int n = random.nextInt(100)+1;//[1-101)
        //int n = random.nextInt(51)+50;//[0-49)+50
        int n = random.nextInt(102);
        System.out.println(n);

        //Math.random(); todo: 自主学习这个方法
    }
    public static void main17(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        while (scanner.hasNextInt()){
            System.out.println("请输入你的年龄： ");
            int age = scanner.nextInt();
            System.out.println("年龄： "+age);*/
        while(scanner.hasNextLine()){
            System.out.println("请输入你的姓名： ");
            String name = scanner.nextLine();
            System.out.println("姓名 "+name );
            //ctr + d 结束
        }
    }
    public static void main16(String[] args) {
        //alt+回车 ctr+鼠标左键 System.in
        Scanner scan = new Scanner(System.in);
        int a = 10;
        System.out.println("输入你的姓名： ");
        String name = scan.nextLine();
        System.out.println("姓名： "+name);

        System.out.println("请输如你的年龄： ");
        int age = scan.nextInt();
        System.out.println("年龄： "+age);

        System.out.println("请输入你的工资：");
        float money = scan.nextFloat();
        System.out.println("工资： "+money);
    }
    public static void main15(String[] args) {
        System.out.println(10);//输出且换行
        System.out.print("不换行");
        System.out.printf("%s","这是格式化输出！");
    }
    public static void main14(String[] args) {
        //for i
     /*   for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }*/
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
    public static void main13(String[] args) {
        int  i = 1;
        while (i <= 100){
            if (i%15 != 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    public static void main12(String[] args) {
        int a = 10;
        while (a >= 0){
            if (a == 9){
                continue;
            }
            a--;
        }
    }
    public static void main11(String[] args) {
        int a = 1;
       /* while (true){
            System.out.println("fffff");
        }*/

        int num = 1;
        while (num <= 100){
            System.out.println(num);
            num++;
        }
    }
    public static void main10(String[] args) {
        int ret2 = 0;
        int n = 1;
        while (n <= 5){
            int i = 1;
            int ret = 1;
            while (i <= n){
                ret *= i;
                i++;
            }
            ret2 += ret;
            n++;
        }
        System.out.println(ret2);
    }
    public static void main9(String[] args) {
        int i = 1;
        int ret = 1;
        while (i <= 5){
            ret *= i;
            i++;
        }
        System.out.println(ret);
    }
    public static void main8(String[] args) {
        //1-100的和
        //1-100的奇数和
        //1-100的偶数和
        int i = 1;
        int sum = 0;
        int sumOdd = 0;
        int sumEve = 0;
        while (i <= 100){
            if(i % 2 == 0){
                sumEve += i;
            }else{
                sumOdd += i;
            }
            sum  += i;
            i++;
        }
        System.out.println(sum);
        System.out.println(sumEve);
        System.out.println(sumOdd);
    }
    public static void main7(String[] args) {
        //1-10
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    public static void main6(String[] args) {
        //不能做switc的参数的数据类型有哪些呢？
        String a = "hello";
        switch (a){
            case "abc":
                System.out.println("two");
                break;
            case "hello":
                System.out.println("one");
                break;
            default:
                System.out.println("没有匹配！");
                break;
        }
    }
    public static void main5(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("没有匹配");
                break;

        }
    }
    public static void main4(String[] args) {
        //求出0～n之间的所有“水仙花数”并输出。
        // (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
        // 如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
        for (int i = 0; i < 10000; i++) {
            int sum = 0;
            int n = 1;
            int t = i;
            //判断此数的位数
            while((t / 10) > 0){
                n++;
                t /= 10;
            }
            //判断是否为水仙花数
            t = i;
            while((t % 10) > 0 ){
                sum += Math.pow(t%10,n);
                t /= 10;
            }
            if(sum == i){
                System.out.println(sum);
            }
        }
    }
    public static void main3(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        int n;
        double ret = 0.0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                n = -1;
            }else {
                n = 1;
            }
            ret += n*1.0 / i;
        }
        System.out.println(ret);
    }
    public static void main2(String[] args) {
        int n = 1;
        int ret2 = 0;
        while(n <= 5){
            int i = 1;
            int ret = 1;
            while (i <= n){
                ret *= i;
                i++;
            }
            ret2 += ret;
            n++;
        }
        System.out.println(ret2);
    }
    public static void main1(String[] args) {
        int sum = 0;
        for(int j = 5; j >= 1; j--) {
            int ret = 1;
            int i = 1;
            while (i <= j) {
                ret *= i;
                i++;
            }
            sum += ret;
        }
        System.out.println(sum);
    }
}
