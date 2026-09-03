package beginner;

public class IfElseBasics {

    public static void main(String[] args) {
        
        System.out.println("--- Simple if ---");
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        System.out.println("\n--- if-else ---");
        int temperature = 30;
        if (temperature > 25) {
            System.out.println("It's hot outside!");
        } else {
            System.out.println("It's cool outside.");
        }

        
        System.out.println("\n--- if-else-if chain (flat) ---");
        int score = 85;

        // ✅ CORRECT: Flat structure, no nesting
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


    }

    
    public static void badExample() {
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else {
            if (score >= 80) {
                System.out.println("Grade: B");
            } else {
                if (score >= 70) {
                    System.out.println("Grade: C");
                } else {
                    if (score >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                }
            }
        }
    }
}
