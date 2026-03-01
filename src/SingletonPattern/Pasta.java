package SingletonPattern;

import java.io.Serializable;

public class Pasta implements Serializable,Cloneable {
    private static Pasta p;

    private Pasta(){

    }

    public static Pasta getInstance(){
        synchronized (Pasta.class){
            if (p==null){
                p=new Pasta();
            }
        }

        return p;
    }

    // optional
    public Object readResolve(){
        return p;
    }
    /* Defualt implementation */
    /*
    @Override
    public Pasta clone() {
        try {
            Pasta clone = (Pasta) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

     */

    @Override
    public Pasta clone() {
        return p;
    }
}
