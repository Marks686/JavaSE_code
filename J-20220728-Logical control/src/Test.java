public class Test {
    public static void main(String[] args) {

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
