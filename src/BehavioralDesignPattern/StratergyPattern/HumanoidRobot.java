package BehavioralDesignPattern.StratergyPattern;

public class HumanoidRobot {
    fly f;
    walk w;
    talk t;

    public HumanoidRobot(fly f, walk w, talk t) {
        this.f = f;
        this.w = w;
        this.t = t;
    }

    public fly getF() {
        return f;
    }

    public walk getW() {
        return w;
    }

    public talk getT() {
        return t;
    }
}
