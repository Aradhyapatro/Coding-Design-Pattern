package CreationalDesignPattern.FactoryPattern.EmployeePattern;

public class Client {
    public static void main(String[] args) {
        Employee e = EmployeePattern.GetSalary("andrioddeveloper");
        int amt = e.getSalary();
        System.out.println("Salary = "+amt);
    }
}
