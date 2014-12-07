package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 23:10
 */
class Other {
    {
        System.out.println("object initialized block.");
    }

    public Other() {
        System.out.println("Other()'s constructor.");
    }

    Other(int o) {
        this();
        System.out.println("Other(int o)'s constructor");
    }
}

public class ObjectInitialBlock {
    public static void main(String[] args) {
        new Other(1);
    }
}