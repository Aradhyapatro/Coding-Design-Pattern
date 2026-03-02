package AbstractFactoryPattern;

public class EmployeeFactory{
    public static Employee getEmployee(AbstractFactory factory) {
        return factory.getEmployee();
    }
}
