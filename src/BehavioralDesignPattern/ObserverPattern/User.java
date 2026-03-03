package BehavioralDesignPattern.ObserverPattern;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void receivedNotification() {
        System.out.println("Hey "+name +" new video is out");
    }
}
