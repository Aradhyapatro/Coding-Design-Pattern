package SOLID_Principle;

interface DiscountStrategy {
    double calculate(double amount);
}

class RegularCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.1;
    }
}

class PremiumCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.2;
    }
}

class DiscountCalculator {

    private DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.calculate(amount);
    }
}

public class O_Open_close_principle {
    public static void main(String[] args) {

        DiscountStrategy regular = new RegularCustomerDiscount();
        DiscountCalculator calculator = new DiscountCalculator(regular);

        System.out.println(calculator.calculateDiscount(1000));

        // Add new type without modifying existing classes
        DiscountStrategy premium = new PremiumCustomerDiscount();
        calculator = new DiscountCalculator(premium);

        System.out.println(calculator.calculateDiscount(1000));
    }
}