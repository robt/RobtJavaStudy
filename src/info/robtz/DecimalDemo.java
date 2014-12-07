package info.robtz;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 17:52
 */
public class DecimalDemo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.8");
        BigDecimal c = a.subtract(b);
        System.out.println(c);
    }
}