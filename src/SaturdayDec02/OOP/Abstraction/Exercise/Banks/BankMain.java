package SaturdayDec02.OOP.Abstraction.Exercise.Banks;

import java.sql.SQLOutput;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("RBC BANK INFO");
        System.out.println("-------------------");
        BankOfCanada rbc = new RbcBank(); // we have taken only reference of parent class and created object of RBC
        rbc.withdraw();
        rbc.deposit();
        rbc.transfer();
        rbc.interestCharge();
        System.out.println("--------------------");
        System.out.println("SCOTIA BANK INFO");
        System.out.println("--------------------");
        BankOfCanada scotia = new ScotiaBank(); // we have taken only reference of parent class and
                                                // created object of Scotia
        scotia.withdraw();
        scotia.deposit();
        scotia.transfer();
        scotia.interestCharge();
        System.out.println("---------------------");
        System.out.println("BMO INFO");
        System.out.println("---------------------");
        BankOfCanada bmo = new BmoBank(); // we have taken only reference of parent class and created object of BMO
        bmo.withdraw();
        bmo.deposit();
        bmo.transfer();
        bmo.interestCharge();
    }



}
