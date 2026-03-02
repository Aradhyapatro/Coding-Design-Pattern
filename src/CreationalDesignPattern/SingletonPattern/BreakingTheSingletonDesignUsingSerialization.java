package CreationalDesignPattern.SingletonPattern;

import java.io.*;

public class BreakingTheSingletonDesignUsingSerialization {
    public static void main(String[] args) throws Exception {
        Pasta pas=Pasta.getInstance();
        ObjectOutputStream oj =new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oj.writeObject(pas);
        System.out.println(pas.hashCode());

        System.out.println("Serialization Done");

        ObjectInputStream res = new ObjectInputStream(new FileInputStream("abc.ob"));
        Pasta p=(Pasta) res.readObject();
        System.out.println(p.hashCode());

        // Serilization must be doing deep copy, solution implements readResolve Method
    }
}
