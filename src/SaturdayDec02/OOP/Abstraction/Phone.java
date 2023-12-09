package SaturdayDec02.OOP.Abstraction;

abstract class Phone {

    public abstract void makeCalls(); //abstract methods cannot have a body and implementation will be done
                                      //by another class
    public abstract void receiveCalls();
}

class Smartphone extends Phone{
    @Override
    public void makeCalls() {
        System.out.println("Make calls abstract method");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Receive calls abstract method");
    }
}
