package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 15:56
 */
public class Range {
    public static void main(String[] args) {
        // byte,short, int, long
        System.out.printf("%d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        // float, double
        System.out.printf("%d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        // char
        System.out.printf("%h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
        // boolean
        System.out.printf("%b ~ %b%n", Boolean.TRUE, Boolean.FALSE);
        System.out.println("\u0048\u0065\u006C");
    }

}