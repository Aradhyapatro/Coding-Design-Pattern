package BehavioralDesignPattern.CommandPattern;

public class CommandController {
    Command comm;

    public CommandController(Command comm) {
        this.comm = comm;
    }

    public void setComm(Command comm) {
        this.comm = comm;
    }

    public void execute(){
        comm.execute();
    }
}
