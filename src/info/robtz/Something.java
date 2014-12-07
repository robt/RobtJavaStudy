package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 23:28
 */
public class Something {
    private Something some;

//    private Something() {}
    public static void create() {
//        if (some == null) {
//            some = new Something();
//        }
//
//        return some;
    }

    private int x;

    public Something(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Something a = new Something(10);
        System.out.println(a.x);
    }
}