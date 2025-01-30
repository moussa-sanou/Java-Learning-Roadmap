// Demonstrates the creation and use of multiple Account objects

public class Transactions {

    // Creates some bank accounts and requests various services.
    public static void main(String[] args) {
        Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account ("Jane Smith", 69713, 40.00);
        Account acct3 = new Account ("Angelica Adams", 69713, 500.00);
        Account acct4 = new Account ("Edward Demsey", 93757, 769.32);

        acct1.deposit(44.10); // return value ignored

        double adamsBalance = acct2.deposit(75.25);
        System.out.println("Adam balance after deposit: " + adamsBalance);

        System.out.println("Adams balance after withdrawal: " + acct2.withdraw(480, 1.50));
    }
}
