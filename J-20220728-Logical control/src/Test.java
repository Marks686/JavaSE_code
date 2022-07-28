public class Test {
    public static void main(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
        int n = 1;
        int ret = 1;
        for (int i = 1; i <= 100; i++) {
            ret = 1/ret;
            ret++;
        }
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
