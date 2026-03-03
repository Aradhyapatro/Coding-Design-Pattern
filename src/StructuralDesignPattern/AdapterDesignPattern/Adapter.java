package StructuralDesignPattern.AdapterDesignPattern;

public class Adapter implements IphoneCharger{
    private GoogleCharger g;

    Adapter(GoogleCharger g){
        this.g=g;
    }

    @Override
    public void charge(Iphone17 ph) {
        g.charge();
        ph.chargingPhone();
        System.out.println("Adapter at work in charging");
    }
}
