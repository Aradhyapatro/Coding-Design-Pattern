package StructuralDesignPattern.AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        Iphone17 ph=new Iphone17();
        GoogleCharger ch=new GoogleCharger();
        Adapter ad=new Adapter(ch);

        ad.charge(ph);
    }
}
