package BehavioralDesignPattern.StratergyPattern;

public class canTalk implements talk{
    @Override
    public void talk() {
        System.out.println("Talks like human");
    }
}
