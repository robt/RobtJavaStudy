package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 23:03
 */

class Some {
    void someMethod(int i) {
        System.out.println("int method is called");
    }

    void someMethod(Integer integer) {
        System.out.println("Integer method is called");
    }
}


public class OverloadBoxing {
    public static void main(String[] args) {
        Some s = new Some();
        s.someMethod(10);
        s.someMethod(new Integer(10));
    }
}


