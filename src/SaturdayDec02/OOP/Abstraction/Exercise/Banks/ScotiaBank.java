package SaturdayDec02.OOP.Abstraction.Exercise.Banks;

public class ScotiaBank extends BankOfCanada{

    @Override
    public void withdraw() {
        System.out.println("Withdrawal limit is $8000");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit limit is $12,000");
    }

    @Override
    public void transfer() {
        System.out.println("Transfer limit is $2500");
    }

    @Override
    public void interestCharge() {
        System.out.println("Interest rate is 8%");
    }
}
