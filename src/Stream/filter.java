package Stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        ArrayList<Person> arr=new ArrayList<>();
        arr.add(new Person("Aradhya",24,5.8f));
        arr.add(new Person("Jay", 21,5.10f));
        arr.add(new Person("Saishree",25,5));
        arr.add(new Person("Amitan", 28, 5.8f));
        arr.add(new Person("Rahul", 30, 5.9f));
        arr.add(new Person("Sneha", 24, 5.5f));
        arr.add(new Person("Kiran", 27, 5.7f));
        arr.add(new Person("Anjali", 22, 5.4f));
        arr.add(new Person("Vikram", 29, 6.0f));
        arr.add(new Person("Neha", 26, 5.6f));
        arr.add(new Person("Arjun", 23, 5.11f));
        arr.add(new Person("Priya", 31, 5.3f));
        arr.add(new Person("Rohan", 28, 5.10f));

        System.out.println(
                arr.parallelStream()
                .filter(a->a.name.startsWith("A"))
                .collect(Collectors.toSet())
        );
    }
}
