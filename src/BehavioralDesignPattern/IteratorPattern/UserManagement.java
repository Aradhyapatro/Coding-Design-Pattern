package BehavioralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    static List<User> l=new ArrayList<>();

    public static void main(String[] args) {
        l.add(new User(1,"Aradhya"));
        l.add(new User(2,"Gaura-hari"));
        l.add(new User(3,"Nityananda"));

        MyIteratorImpl it=new MyIteratorImpl(l);

        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }

}
