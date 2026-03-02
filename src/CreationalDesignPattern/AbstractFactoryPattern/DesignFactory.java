package CreationalDesignPattern.AbstractFactoryPattern;

public class DesignFactory extends AbstractFactory{
    @Override
    public Employee getEmployee() {
        return new Design();
    }
}
