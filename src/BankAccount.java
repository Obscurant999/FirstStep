/**
 * Created by Student-22 on 10.06.2017.
 */
public class BankAccount {

    long accountNumber;
    double balance;
    double rubles;
    double pennies;

    BankAccount() {
        //System.out.println("Nel mezzo del cammin di nostra vita");
        accountNumber = 10L;
        balance = 20d;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    double getDoubleBalance() {
        double doubleBalance = balance * 2;
        return doubleBalance;
    }

    void setValue(double newRubles) {
        rubles = newRubles;
        pennies = 0.0d;
    }

    void setValue(double newRubles, double newPennies) {
        rubles = newRubles;
        pennies = newPennies;
    }

}
