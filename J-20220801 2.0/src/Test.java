import java.util.Arrays;

public class Test {


        public static int twofind(int[] array,int tofind){
            int left = 0;
            int right = array.length-1;
            while (left<=right){
                int mid = (left+right)>>1;
                if (tofind>array[mid]){
                    left = mid+1;
                } else if (tofind<array[mid]) {
                    right = mid-1;
                }else {
                    return mid;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] array1 = {1,2,3,4,5,6};
            int tmp = twofind(array1,6);
            System.out.println(tmp);
        }
        public static void exc(int[] array){
            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length-1-i; j++) {
                    if (array[j] % 2 == 0){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
        }
        public static void main4(String[] args) {
            int[] array1 = {1,2,3,4,5,6};
            exc(array1);
            System.out.println(Arrays.toString(array1));
        }
        public static double avg(int[] array1) {
            int sum = 0;
            for (int x : array1) {
                sum += x;
            }
            return sum*1.0/2;
        }
        public static void main3(String[] args) {
            int[] array1 = {1,2,3,4,5,6};
            double tmp = avg(array1);
            System.out.println(tmp);
        }
        public static void transform(int[] array){
            for (int i = 0;i< array.length;i++){
                array[i] *= 2;
            }
        }
        public static void main2(String[] args) {
            int[] array = {1,2,3};
            transform(array);
            System.out.println(Arrays.toString(array));
        }

    }
