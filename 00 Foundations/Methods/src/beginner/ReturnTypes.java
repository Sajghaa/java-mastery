package beginner;

import java.util.Optional;

public class ReturnTypes {

    public static void main(String[] args) {

        System.out.println("--- void (returns nothing) ---");
        printMessage("Hello!"); 

        System.out.println("\n--- Primitive returns ---");
        int sum = add(5, 3);
        boolean isEven = isEven(4);
        double average = average(10, 20);
        System.out.println("Sum: " + sum);
        System.out.println("Is 4 even? " + isEven);
        System.out.println("Average: " + average);

        System.out.println("\n--- Reference returns ---");
        String greeting = greet("Alice");
        Person person = createPerson("Bob", 30);
        System.out.println("Greeting: " + greeting);
        System.out.println("Person: " + person);

        System.out.println("\n--- Optional (no more null!) ---");
        Optional<String> name = findName(1); 
        Optional<String> missing = findName(99);

        name.ifPresent(n -> System.out.println("Name found: " + n));
        System.out.println("Missing: " + missing.orElse("Not found"));

        System.out.println("\n--- Throwing exception ---");
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0; 
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    public static Optional<String> findName(int id) {

        if (id == 1) {
            return Optional.of("Alice");
        }
        return Optional.empty(); 
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

}