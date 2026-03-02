package FactoryPattern.EmployeePattern;

public class AndriodDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting Salary of Andriod Developer");
        return 45000;
    }
}
