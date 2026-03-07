package BehavioralDesignPattern.StratergyPattern;

public class canFly implements fly{
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
