package SaturdayDec23.Generics;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee<String, String> employee = new Employee<>("5231", "Rajan");
        Employee<Integer, String> employee2 = new Employee<>(5231, "Rajan");
        employee.showDetails();
        employee2.showDetails();

    }
}
