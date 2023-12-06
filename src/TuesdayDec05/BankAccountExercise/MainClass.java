package TuesdayDec05.BankAccountExercise;

public class MainClass {

    //This exercise was done using Hierarchical inheritance
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("Rajan Halai", 100000.00, 1.25, 5000);
        checkingAccount.displayInfo();
        checkingAccount.displayInterestRate();
        checkingAccount.displayOverdraftLimit();
    }
}
