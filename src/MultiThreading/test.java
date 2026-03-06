package MultiThreading;

public class test {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread t=new Thread1("aradhya");
        t.run();

        Thread t2=new Thread(new Thread2(),"Aradhya");
        t2.start();

        Thread t3=new Thread(()->{
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName()+" is "+i);
            }
        },"Patro");
        t3.start();

        System.out.println("Exit");
    }
}
