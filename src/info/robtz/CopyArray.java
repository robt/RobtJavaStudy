package info.robtz;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 18:12
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] scores1 = {88, 82, 43, 75, 36, 24, 95, 87, 93};
//        int[] scores2 = scores1;
//        scores2[0] = 84;
//        System.out.println(scores1[0]);
        int[] scores2 = Arrays.copyOf(scores1, scores1.length * 2);
        for (int score : scores2) {
            System.out.printf("%3d", score);
        }
    }
}