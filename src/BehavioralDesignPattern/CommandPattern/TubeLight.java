package BehavioralDesignPattern.CommandPattern;

public class TubeLight {
    String TubeName;

    public TubeLight(String name){
        TubeName=name;
    }

    public void switchOn(){
        System.out.println(TubeName + " is on now");
    }

    public void switchOff(){
        System.out.println(TubeName+" is off now");
    }
}
