package TuesdayDec05.BankAccountExercise;

public class BankAccount {

    //This exercise was done using hierarchical inheritance

    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayInfo(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
