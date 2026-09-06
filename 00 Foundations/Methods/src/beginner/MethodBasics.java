package beginner;

public class MethodBasics {

    public static void main(String[] args) {

        System.out.println("--- Method basics ---");

        printGreeting();

        int sum = add(5, 3);
        System.out.println("5 + 3 = " + sum);

        String message = buildMessage("Alice", 25);
        System.out.println(message);

        boolean isValid = isValidEmail("alice@example.com");
        System.out.println("Email valid: " + isValid);
    }

    public static void printGreeting() {
        System.out.println("Hello, World!");
    }

    public static int add(int a, int b) {
        return a + b; 
    }

    public static String buildMessage(String name, int age) {
        return "Name: " + name + ", Age: " + age;
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return email.contains("@");
    }

    public static String getGrade(int score) {
        // Guard: invalid input
        if (score < 0 || score > 100) {
            return "Invalid score";
        }
        // Happy path
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }


}