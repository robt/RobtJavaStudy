package info.robtz;

/**
 * Created with IntelliJ IDEA.
 * User: lixin.zoulx
 * Date: 2014/11/23
 * Time: 22:14
 */
public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.setNumber(number);
        this.setBalance(balance);
        this.setBonus(bonus);
    }

    void store(int money) {
        if (money > 0) {
            this.setBalance(this.getBalance() + money);
            if (money > 1000) {
                this.setBonus(this.getBonus() + 1);
            }
        } else {
            System.out.println("储值是负数？你是逗逼来的么？");
        }
    }

    void charge(int money) {
        if (money > 0) {
            if (money <= this.getBalance()) {
                this.setBalance(this.getBalance() - money);
            } else {
                System.out.println("钱不够啦！");
            }
        } else {
            System.out.println("扣负数？你是逗逼么？");
        }
    }

    int exchange(int bonus) {
        if (bonus > 0) {
            this.setBonus(this.getBonus() - bonus);
        }

        return this.getBonus();
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}