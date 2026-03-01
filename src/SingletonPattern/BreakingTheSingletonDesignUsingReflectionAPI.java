package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Samosa{
    private static Samosa s;

    private Samosa(){

    }

    public static Samosa getInstance(){
        synchronized (Samosa.class){
            if (s==null){
                s=new Samosa();
            }
        }

        return s;
    }
}

public class BreakingTheSingletonDesignUsingReflectionAPI {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);// comment this to see the private cons error.
        System.out.println(Samosa.getInstance().hashCode());
        Samosa s=constructor.newInstance();
        System.out.println(s.hashCode());
    }
}
