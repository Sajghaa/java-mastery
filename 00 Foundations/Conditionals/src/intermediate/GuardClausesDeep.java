package intermediate;

public class GuardClausesDeep {

    public static void main(String[] args) {
        System.out.println("--- Throwing exceptions ---");

    try {
        processPayment(-10.0);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    try {
        processPayment(100.0);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

    System.out.println("\n--- Multiple guards ---");
    registerUser("alice@example.com", "pass123");
    registerUser(null, "pass123");
    registerUser("bob@example.com", null);
    registerUser("charlie@example.com", "123");
    registerUser("", "pass123");


    System.out.println("\n--- Guard clauses with return value ---");
    System.out.println("Discount for 150: " + calculateDiscount(150));
    System.out.println("Discount for -5: " + calculateDiscount(-5));
    System.out.println("Discount for 100: " + calculateDiscount(1000));


    System.out.println("\n--- Guard clause in constructor ---");
    try {
        new Person("", 25);
    } catch (IllegalArgumentException e) {
        System.out.println("Constructor error: " + e.getMessage());
    }

    try {
        new Person("Alice", -5);
    } catch (IllegalArgumentException e) {
        System.out.println("Constructor error: " + e.getMessage());
    }

    new Person("Bob", 30);

    }

    public static void processPayment(double amount) {
        
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }

        System.out.println("Processing payment of $" + amount);
    }

    public static void registerUser(String email, String password) {

        if (email == null || email.trim().isEmpty()) {
            System.out.println("Email is required");
            return;
        }

        if (password == null) {
            System.out.println("Password is required.");
            return;
        }

        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters.");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("Invalid email format");
            return;
        }

        System.out.println("User " + email + " registered successfully!");
    }

    public static double calculateDiscount(double amount) {

        if (amount < 0) {
            System.out.println("Warning: Negative amount. Returning 0 discount");
            return 0.0;
        }

        if (amount > 500) {
            return 50.0;
        }

        return amount *0.1;
    }

    static class Person{
        private final String name;
        private final int age;

        public Person(String name, int age) {

            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            this.name = name;
            this.age = age;

            System.out.println("Person created: " + name + ", " + age);
        }
    }
    
}
