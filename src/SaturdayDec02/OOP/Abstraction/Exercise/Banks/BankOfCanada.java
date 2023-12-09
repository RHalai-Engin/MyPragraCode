package SaturdayDec02.OOP.Abstraction.Exercise.Banks;

public abstract class BankOfCanada {

    public abstract void withdraw();
    public abstract void deposit();
    public abstract void transfer();
    public abstract void interestCharge();

    public void authority(){
        System.out.println("Only Bank of Canada decides how banks should operate.");
    }
}
