package intermediate;

public class TernaryOperator {
    
    public static void main(String[] args) {
        
        System.out.println("--- GOOD: Simple assignment --");
        int age = 24;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);


        System.out.println("\n--- GOOD: Choosing between two values ---");
        int x = 10, y = 20;
        int max = (x > y) ? x : y;
        System.out.println("Max: " + max);

        System.out.println("\n--- BAD: Nested ternary (UNREADABLE) ---");

        int score = 85;

        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       (score >= 60) ? "D" : "F";
        System.out.println("Grade: " + grade);

        System.out.println("\n--- BAD: Side effects ---");
        int count = 5;

        String result = (count++ > 5) ? "Greater" : "Less";
        System.out.println("Result: " + result + ", count: " + count);

        System.out.println("\n--- GOOD: Method argument ---");
        printMessage((age >= 18) ? "Welcome, adult!" : "Welcome, young one!");

        System.out.println("\n--- GOOD: Null check ---");
        String name = null;
        String displayName = (name != null) ? name : "Guest";
        System.out.println("Display name: " + displayName);
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
    }
}
