package StructuralDesignPattern.Decorator.Coffee;

interface Coffee {
    String getDescription();
    double getCost();
}

// Concrete Component
class BasicCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

// Abstract Decorator
abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// Concrete Decorator - Milk
class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}

// Concrete Decorator - Sugar
class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}

// Main class (only this one should be public)
public class CoffeeDecoratorDemo {

    public static void main(String[] args) {

        Coffee coffee = new BasicCoffee();    // Basic coffee
        coffee = new MilkDecorator(coffee);   // Add milk
        coffee = new SugarDecorator(coffee);  // Add sugar

        System.out.println(coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
    }
}