package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 18:17
 */

class MyClothes {
    String color;
    char size;

    MyClothes(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        MyClothes[] c1 = {new MyClothes("red", 'L'), new MyClothes("Green", 'M')};
        MyClothes[] c2 = new MyClothes[c1.length];
        for (int i = 0; i < c1.length; i++) {
            c2[i] = c1[i];
        }

        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}