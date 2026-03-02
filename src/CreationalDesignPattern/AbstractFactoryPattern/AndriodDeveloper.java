package CreationalDesignPattern.AbstractFactoryPattern;

public class AndriodDeveloper implements Employee{

    @Override
    public int getSalary() {
        return 62000;
    }

    @Override
    public String name() {
        return "I am Andriod Developer";
    }
}
