package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 18:17
 */

class MyClothes2 {
    String color;
    char size;

    MyClothes2(String color, char size) {
        this.color = color;
        this.size = size;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        MyClothes2[] c1 = {new MyClothes2("red", 'L'), new MyClothes2("Green", 'M')};
        MyClothes2[] c2 = new MyClothes2[c1.length];
        for (int i = 0; i < c1.length; i++) {
            c2[i] = new MyClothes2(c1[i].color, c1[i].size) ;
        }

        c1[0].color = "yellow";
        System.out.println(c2[0].color);

        int x = 300;
        int y = 300;
        Integer wx = x;
        Integer wy = y;
        System.out.println(wx.equals(x));
        System.out.println(wy.equals(y));
        String[][] str = {
                {"Java", "Java", "Java"},
                {"Java", "Java", "Java", "Java"},
        };

        System.out.println(str.length);
        System.out.println(str[0].length);
        System.out.println(str[1].length);
    }
}