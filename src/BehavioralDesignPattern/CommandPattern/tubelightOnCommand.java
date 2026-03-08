package BehavioralDesignPattern.CommandPattern;

public class tubelightOnCommand implements Command{
    private TubeLight t;

    public tubelightOnCommand(TubeLight t){
        this.t=t;
    }

    @Override
    public void execute() {
        t.switchOn();
    }
}
