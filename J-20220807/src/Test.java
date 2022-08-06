    import java.util.Arrays;
    public class Test {
        public static boolean func4(int[] array){
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] %2 != 0){
                    count++;
                    if (count == 3){
                        return true;
                    }
                }else {
                    count = 0;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] array = {1,2,7,2,1};
            System.out.println(func4(array));
        }
        public int majorityElement(int[] array){
            int ret = array[0];
            int count =0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ret){
                    count++;
                }else {
                    count--;
                }
                if (count == 0){
                    ret =array[i+1];
                }
            }
            return ret;
        }
        public static int func3(int[] array){
            int ret = array[0];
            for (int i = 1; i < array.length; i++) {
                ret = ret^array[i];

            }
            return ret;
        }
        public static void main8(String[] args) {
            int[] array = {1,2,7,2,1};
            System.out.println(func3(array));
        }
        public static int[] func2(int[] array,int target){
            int[] ret = new int[2];
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] + array[j] == target){
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                }
            }
            return ret;
        }
        public static void main7(String[] args) {
            int[] nums = {2,7,11,15};
            func2(nums,9);

        }
        public static void func1(int[ ] array){
            int i = 0;
            int j = array.length-1;
            while (i<j){
                while (i<j && array[i]%2 != 0){
                    i++;
                }
                while (i<j && array[j]%2 == 0){
                    j--;
                }
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        public static void main6(String[] args) {
            int[] array = {1,2,3,4,5,6};
            func1(array);
            System.out.println(Arrays.toString(array));
        }
        public static void main5(String[] args) {
            //不规则的数组 --> 列可以省略
            int[][] array1 = new int[2][];
            array1[0] = new int[3];
            array1[1] = new int[4];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    System.out.print(array1[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main3(String[] args) {
            int[][] array1 = new int[2][3];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();


            System.out.println(Arrays.deepToString(array1));
            System.out.println();
            for (int[] arr:array1) {
                for (int x:arr) {
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
        public static void main2(String[] args) {
            int[][] array1 = new int[2][3];
            int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
            int[][] array3 = {{1,2,3},{4,5,6}};
        }
        public static void bubbleSort(int[] array){
            //i控制趟数
            for (int i = 0; i < array.length-1; i++) {
                boolean flg = false;
                //array.length-1-i优化的是每一趟比较的次数
                for (int j = 0; j < array.length-1-i; j++) {
                    if (array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                        flg = true;
                    }
                }
                if (flg == false){
                    return;
                }
            }
        }
        public static void main1(String[] args) {
            int[] array = {12,6,2,8,3,9,10};
            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        }
}
