package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 16:47
 */
public class Comparison {
    public static void main(String[] args) {
        System.out.printf("10 > 5 结果 %b%n", 10 > 5);
        System.out.printf("10 >= 5 结果 %b%n", 10 >= 5);
        float PI = (float) 3.14;
        System.out.println(PI);
//        long number = 2147483648L;
//        System.out.println(number);

        int i = 10;
        int number = ++i;
        number = ++i;
        System.out.println(i);
        System.out.println(number);
        for(number = 0; number != 5; number = (int)(Math.random() * 10)) {
            System.out.println(number);
        }

        for (int j = 100; j < 1000; j++) {
            int m = j / 100;
            int n = (j - 100 * m) / 10;
            int k = (j - 100 * m - 10 * n);

            double left_number = Math.pow(m, 3) + Math.pow(n, 3) + Math.pow(k, 3);
            if (j == left_number) {
                System.out.println(j);
            }
        }
    }
}