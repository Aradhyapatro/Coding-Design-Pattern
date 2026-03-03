package BehavioralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements myIterator{
    int position=0;
    List<User> arr=new ArrayList<>();
    int size=0;

    public MyIteratorImpl(List<User> l){
        arr= l;
        size=l.size();
    }

    @Override
    public boolean hasNext() {
        if(position>=size){
            return false;
        }
        return true;
    }

    @Override
    public User next() {
        User u=arr.get(position);
        position++;
        return u;
    }
}
