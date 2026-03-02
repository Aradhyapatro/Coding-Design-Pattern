package AbstractFactoryPattern;

public class AndriodDeveloperFactory extends AbstractFactory{
    public Employee getEmployee(){
        return new AndriodDeveloper();
    }
}
