package info.robtz;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 22:18
 */
public class CashApp {

    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                new CashCard("A004", 2000, 2),
                new CashCard("A005", 3000, 3),
                new CashCard("A006", 4000, 4)
        };


//        for (CashCard card : cards) {
//            System.out.printf("(%s, %d, %d)%n", card.number, card.balance, card.bonus);
//        }
        Scanner scanner = new Scanner(System.in);
        for (CashCard card : cards) {
            System.out.printf("store money for (%s, %d, %d):", card.getNumber(), card.getBalance(), card.getBonus());
            card.store(scanner.nextInt());
            System.out.printf("detail: (%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
        }
    }

}