package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 23:20
 */
public class MathTool {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(MathTool.sum(1, 2));
        System.out.println(MathTool.sum(1, 23, 4));
        System.out.println(MathTool.sum(2,3,4,8));
    }
}