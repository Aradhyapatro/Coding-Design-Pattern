package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Bhujia{
    private static Bhujia s;

    private Bhujia(){
        throw new RuntimeException("You are Trying to brake Singleton Pattern");
    }

    public static Bhujia getInstance(){
        synchronized (Bhujia.class){
            if (s==null){
                s=new Bhujia();
            }
        }

        return s;
    }
}

public class SolutionforBreakingUsingErrorInConstructor {
    public static void main(String[] args) throws Exception {
        Constructor<Bhujia> constructor=Bhujia.class.getDeclaredConstructor();
        constructor.setAccessible(true);// comment this to see the private cons error.
        System.out.println(Samosa.getInstance().hashCode());
        Bhujia s=constructor.newInstance();
        System.out.println(s.hashCode());
    }
}
