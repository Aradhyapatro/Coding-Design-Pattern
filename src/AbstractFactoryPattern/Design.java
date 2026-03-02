package AbstractFactoryPattern;

public class Design implements Employee{
    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public String name() {
        return "I am Code Designer";
    }
}
