package SingletonPattern;

class Quaduple{
    private static Quaduple q;

    private Quaduple(){

    }

    public static Quaduple getInstance(){
        if(q==null){
            q=new Quaduple();
        }

        return q;
    }
}

public class SingletonPattern_with_Lazy_Initialization {
    public static void main(String[] args) {
        System.out.println(Quaduple.getInstance());
    }
}
