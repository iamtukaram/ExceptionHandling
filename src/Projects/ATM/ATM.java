package Projects.ATM;

public class ATM {
   private double balance;
   public ATM(double balance){
       this.balance = balance;
   }

   public void withdraw(double amount) throws InsufficientBalanceException{
       if(amount > balance){
           throw new InsufficientBalanceException("Insufficient balance");
       }
       balance -= amount;
       System.out.println("Withdrawal successful "+balance);
   }
   public void deposit(double amount){
       if (amount <= 0) {
           System.out.println("Invalid deposit amount.");
           return;
       }
       balance += amount;
       System.out.println("Deposit successful. New balance: " + balance);
   }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
