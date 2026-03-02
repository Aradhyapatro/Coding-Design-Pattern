package CreationalDesignPattern.ProtoTypePattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnect net=new NetworkConnect();
        net.setIp("192.109.82.71");
        net.setData("The data i have is very important");
        net.getImportantData();

        System.out.println(net);

        try {
            System.out.println("new cloned object");
            NetworkConnect net2=(NetworkConnect) net.clone();
            System.out.println(net2);
            System.out.println(net.equals(net2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
