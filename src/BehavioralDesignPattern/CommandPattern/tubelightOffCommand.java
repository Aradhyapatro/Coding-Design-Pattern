package BehavioralDesignPattern.CommandPattern;

public class tubelightOffCommand implements  Command{
    TubeLight t;

    public tubelightOffCommand(TubeLight t) {
        this.t=t;
    }

    @Override
    public void execute() {
        t.switchOff();
    }
}
