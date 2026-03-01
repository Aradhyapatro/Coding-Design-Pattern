package SingletonPattern;

class Power{
    private static Power p;

    private Power(){

    }

    public static Power getInstance(){
        synchronized (Power.class){
            if (p==null){
                p=new Power();
            }
        }

        return p;
    }
}

public class Singleton_Pattern_with_Synchronized_Block {
    public static Power getI(){
        return Power.getInstance();
    }

    public static void main(String[] args) {

        System.out.println(Power.getInstance().hashCode());
        System.out.println(Power.getInstance().hashCode());

    }
}
