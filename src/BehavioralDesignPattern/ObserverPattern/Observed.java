package BehavioralDesignPattern.ObserverPattern;

public interface Observed {

    void addSubscription(User u);

    void removeSubscription(User u);

    void sendNotification();
}
