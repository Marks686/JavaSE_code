public class Test {
    public static void main(String[] args) {
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
