package SaturdayDec02.OOP.Abstraction.Exercise.Banks;

public class BmoBank extends BankOfCanada{

    @Override
    public void withdraw() {
        System.out.println("Withdrawal limit is $2000");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit limit is $10,000");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer limit is $3000");
    }

    @Override
    public void interestCharge() {
        System.out.println("Interest rate is 5%");
    }
}
