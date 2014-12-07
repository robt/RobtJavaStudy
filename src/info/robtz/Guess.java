package info.robtz;

import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/22
 * Time: 17:47
 */
public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.print("Guess number (0 - 9):");
            guess = scanner.nextInt();

        } while (guess != number);

        System.out.println("Bingo!...XD");

    }
}