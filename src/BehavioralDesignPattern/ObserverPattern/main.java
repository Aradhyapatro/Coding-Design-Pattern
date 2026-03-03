package BehavioralDesignPattern.ObserverPattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Youtube you=new Youtube();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("The Options Available");
            System.out.println("1. Add Subscription to User");
            System.out.println("2. Remove Subscription from User");
            System.out.println("3. Send Notification");
            System.out.println("4. EXIT");
            System.out.println("Enter you choice");
            int num=sc.nextInt();

            if (num==1) {
                System.out.println("Enter the User Name");
                String name=sc.next();
                User u=new User(name);
                you.addSubscription(u);
            } else if (num == 2) {
                System.out.println("Enter the Name of the person who wants " +
                        "to remove the subscription");
                String name = sc.next();
                User u=new User(name);
                you.removeSubscription(u);
            } else if (num == 3) {
                you.sendNotification();
            } else{
                break;
            }
        }
        sc.close();
    }
}
