package BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Youtube implements Observed{
    List<User> subscribers=new ArrayList<>();


    @Override
    public void addSubscription(User u) {
        subscribers.add(u);
    }

    @Override
    public void removeSubscription(User u) {
        subscribers=subscribers.stream().filter(a->a.getName().equalsIgnoreCase(u.getName())==false).collect(Collectors.toList());
    }

    @Override
    public void sendNotification() {
        for(User u:subscribers){
            u.receivedNotification();
        }
    }
}
