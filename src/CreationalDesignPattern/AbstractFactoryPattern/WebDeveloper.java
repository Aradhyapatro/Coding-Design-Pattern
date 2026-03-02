package CreationalDesignPattern.AbstractFactoryPattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String name() {
        return "I am Web-Developer";
    }
}
