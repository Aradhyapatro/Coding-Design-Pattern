package SingletonPattern;

public class BreakingTheSignletonDesignUsingClone {
    public static void main(String[] args) {
        Pasta p=Pasta.getInstance();

        Pasta pp=p.clone();
        System.out.println(p.hashCode());
        System.out.println(pp.hashCode());

        /* different cause shallow coping override the default implementation to
        * to resolve the issue.
        * */
    }
}
