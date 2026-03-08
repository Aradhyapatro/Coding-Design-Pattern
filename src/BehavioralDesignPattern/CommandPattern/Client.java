package BehavioralDesignPattern.CommandPattern;

public class Client {
    public static void main(String[] args) {
        TubeLight T1=new TubeLight("Surya");
        tubelightOnCommand T1On=new tubelightOnCommand(T1);
        CommandController remote = new CommandController(T1On);

        remote.execute();

        TubeLight T2=new TubeLight("Sunrise");
        tubelightOnCommand T2On = new tubelightOnCommand(T2);
        remote.setComm(T2On);

        remote.execute();

        tubelightOffCommand T1Off = new tubelightOffCommand(T1);
        remote.setComm(T1Off);

        remote.execute();
    }
}
