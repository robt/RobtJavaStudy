package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/25
 * Time: 7:56
 */
public class RPG {

    public static void showBlood(Role role) {
        System.out.printf("%s's blood is %d%n", role.getName(), role.getBlood());
    }

    public static void main(String[] args) {
        SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        System.out.printf("SwordsMan, (%s, %d, %d)%n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());

        showBlood(swordsMan);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        System.out.printf("Magician, (%s, %d, %d)\n", magician.getName(), magician.getLevel(), magician.getBlood());

        showBlood(magician);
    }
}