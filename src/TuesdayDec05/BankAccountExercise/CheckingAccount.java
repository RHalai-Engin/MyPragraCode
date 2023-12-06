package TuesdayDec05.BankAccountExercise;

public class CheckingAccount extends SavingAccount{

    //This exercise was done using hierarchical inheritance

    double overDraftLimit;

    public CheckingAccount(String accountHolder, double balance, double interestRate, double overDraftLimit) {
        super(accountHolder, balance, interestRate);
        this.overDraftLimit = overDraftLimit;
    }

    public void displayOverdraftLimit(){
        System.out.println("Your overdraft limit: " + overDraftLimit);
    }
}
