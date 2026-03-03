package StructuralDesignPattern.AdapterDesignPattern;

public class GoogleCharger implements AndriodCharger{
    @Override
    public void charge() {
        System.out.println("Phone is being charged by Andriod Charger");
    }
}
