package BehavioralDesignPattern.StratergyPattern;

public class Client {
    public static void main(String[] args) {
        HumanoidRobot r=new HumanoidRobot(new noFly(),new canWalk(),new canTalk());
        AvianRobot a=new AvianRobot(new canFly(),new noWalk(),new noTalk());

        System.out.println("Humonoid robot");
        r.getF().fly();
        r.getT().talk();
        r.getW().walk();

        System.out.println("Avian robot");
        a.getF().fly();
        a.getT().talk();
        a.getW().walk();
    }
}
