package CreationalDesignPattern.AbstractFactoryPattern;

public class WebDeveloperFactory extends AbstractFactory{
    @Override
    public Employee getEmployee() {
        return new WebDeveloper();
    }
}
