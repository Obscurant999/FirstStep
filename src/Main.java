/**
 * Created by Student-22 on 10.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.accountNumber);
        account.setBalance(50.4d);
        System.out.println("Balance = " + account.balance);
        account.setBalance(49.3d);
        System.out.println("Balance = " + account.balance);

        double doubleBalance = account.getDoubleBalance();
        System.out.println("Double Balance = " + doubleBalance);

        account.setValue(30d);
        System.out.println("Rubles = " + account.rubles + ", pennies = " + account.pennies);

        account.setValue(23d, 51d);
        System.out.println("Rubles = " + account.rubles + ", pennies = " + account.pennies);
    }

}
