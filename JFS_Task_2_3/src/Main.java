//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account(1000.00, "Alex");

        myAccount.displayBalance();
        myAccount.deposit(500.00);
        myAccount.withdraw(300.00);
        myAccount.withdraw(1500.00);
        myAccount.displayBalance();
    }
}