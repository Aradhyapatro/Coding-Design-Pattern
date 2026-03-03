package StructuralDesignPattern.AdapterDesignPattern;

public class AppleCharger implements IphoneCharger{

    @Override
    public void charge(Iphone17 ph) {
        ph.chargingPhone();
        System.out.println("Phone is being Charged by Apple Charger");
    }
}
