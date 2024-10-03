package Projects.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);

        try {
            atm.withdraw(12000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }

        atm.deposit(500);
        atm.checkBalance();
    }
}
