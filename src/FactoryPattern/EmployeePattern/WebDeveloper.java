package FactoryPattern.EmployeePattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Getting the Salary of Web-Developer");
        return 52150;
    }
}
