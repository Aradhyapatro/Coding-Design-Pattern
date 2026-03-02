package AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Employee e1=EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(e1.getSalary());
        System.out.println(e1.name());

        Employee e2=EmployeeFactory.getEmployee(new AndriodDeveloperFactory());
        System.out.println(e2.getSalary());
        System.out.println(e2.name());

        Employee e3=EmployeeFactory.getEmployee(new DesignFactory());
        System.out.println(e3.getSalary());
        System.out.println(e3.name());
    }
}
