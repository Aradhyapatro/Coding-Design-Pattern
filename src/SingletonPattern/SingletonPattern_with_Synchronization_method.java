package SingletonPattern;

class Might{
    private static Might m;

    private Might(){

    }

    // synchronized makes it thread safe
    public synchronized static Might getInstance(){
        if (m==null){
            m=new Might();
        }

        return m;
    }

}

public class SingletonPattern_with_Synchronization_method {
    public static void main(String[] args) {

        System.out.println(Might.getInstance().hashCode());
        System.out.println(Might.getInstance().hashCode());

    }
}
