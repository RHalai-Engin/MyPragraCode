package SaturdayDec22.Generics;

public class Employee <I,N> {

    I id;
    N name;

    public Employee(I id, N name) {
        this.id = id;
        this.name = name;
    }

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
