package TuesdayDec05.BankAccountExercise;

public class SavingAccount extends BankAccount{
    //This exercise was done using hierarchical inheritance
    double interestRate;

    public SavingAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayInterestRate(){
        System.out.println("Your Interest Rate is: " + interestRate);
    }
}
