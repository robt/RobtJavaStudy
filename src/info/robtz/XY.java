package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 18:06
 */
public class XY {
    public static void main(String[] args) {
        int[][] cords = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int x = 0; x < cords.length; x++) {
            for (int y = 0; y < cords[x].length; y++) {
                System.out.println(cords[x][y]);
            }
        }
    }

}