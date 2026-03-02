package CreationalDesignPattern.SingletonPattern;

class Mono{
    private static Mono m = new Mono();

    private Mono(){
    }

    public static Mono getMono(){
        return m;
    }

}

public class SingletonPattern_with_Eager_Initialization {
    public static void main(String[] args) {
        System.out.println(Mono.getMono());
    }
}
