package intermediate;

public class SwitchExpressions {
    
    public static void main(String[] args) {
        
        System.out.println("--- Switch expression (arrow) ---");
        int day = 5;

        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Day " + day + " is a " + type);

        System.out.println("\n--- Multiple labels ---");
        char grade = 'B';
        String message = switch (grade) {
            case 'A', 'B' -> "Good job!";
            case 'C' -> "Keep trying";
            case 'D', 'F' -> "Needs improvement.";
            default -> "Invalid grade.";
        };
        System.out.println("Grade " + grade + ": " + message);

        System.out.println("\n--- Using `yield` (multi-line) ---");
        int number = 42;
        String description = switch (number) {
            case 0 -> "Zero";
            case 1, 2, 3 -> "Small positive";
            case 42 -> {
                String phrase = "The answer to life, the universe, and everything";

                yield phrase;
            }
            default -> "Some other number";
        };
        System.out.println("Description: " +  description);

        System.out.println("\n--- Exhaustive enum switch ---");
        Priority priority = Priority.HIGH;

        String action = switch (priority) {
            case LOW -> "Take your time";
            case MEDIUM -> "Aim for this sprint";
            case HIGH -> "Do it now!";
            case URGENT -> "Drop everything!";
        };
        System.out.println("Priority action: " + action);
    }

    enum Priority { LOW, MEDIUM, HIGH, URGENT}
}
