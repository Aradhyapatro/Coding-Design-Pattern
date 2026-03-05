package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

class Person{
    String name;
    int age;
    float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

public class parallelismInStream {


    public static void main(String[] args) {
        ArrayList<Person> arr=new ArrayList<>();
        arr.add(new Person("Aradhya",24,5.8f));
        arr.add(new Person("Jay", 21,5.10f));
        arr.add(new Person("Saishree",25,5));
        arr.add(new Person("Amit", 28, 5.8f));
        arr.add(new Person("Rahul", 30, 5.9f));
        arr.add(new Person("Sneha", 24, 5.5f));
        arr.add(new Person("Kiran", 27, 5.7f));
        arr.add(new Person("Anjali", 22, 5.4f));
        arr.add(new Person("Vikram", 29, 6.0f));
        arr.add(new Person("Neha", 26, 5.6f));
        arr.add(new Person("Arjun", 23, 5.11f));
        arr.add(new Person("Priya", 31, 5.3f));
        arr.add(new Person("Rohan", 28, 5.10f));


        long start = System.nanoTime();
        Collections.sort(arr, (a, b) -> a.age - b.age);
        long end = System.nanoTime();
        long executionTime = end - start;
        System.out.println("Sorting took: " + executionTime + " nanoseconds");


        ArrayList<Person> a=new ArrayList<>();
        a.add(new Person("Aradhya",24,5.8f));
        a.add(new Person("Jay", 21,5.10f));
        a.add(new Person("Saishree",25,5));
        a.add(new Person("Amit", 28, 5.8f));
        a.add(new Person("Rahul", 30, 5.9f));
        a.add(new Person("Sneha", 24, 5.5f));
        a.add(new Person("Kiran", 27, 5.7f));
        a.add(new Person("Anjali", 22, 5.4f));
        a.add(new Person("Vikram", 29, 6.0f));
        a.add(new Person("Neha", 26, 5.6f));
        a.add(new Person("Arjun", 23, 5.11f));
        a.add(new Person("Priya", 31, 5.3f));
        a.add(new Person("Rohan", 28, 5.10f));


        start = System.nanoTime();
        a.parallelStream().sorted((aa,b)->aa.age-b.age).toList();
        end = System.nanoTime();
        executionTime = end - start;
        System.out.println("parallel Sorting took: " + executionTime + " nanoseconds");
    }
}
