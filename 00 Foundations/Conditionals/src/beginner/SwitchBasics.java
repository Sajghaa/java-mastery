package beginner;

public class SwitchBasics {

    public static void main(String[] args) {
        
        System.out.println("--- int switch ---");
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);

       
        System.out.println("\n--- char switch ---");
        char grade = 'B';
        String message;

        switch (grade) {
            case 'A':
                message = "Excellent!";
                break;
            case 'B':
                message = "Good job!";
                break;
            case 'C':
                message = "Keep trying.";
                break;
            case 'D':
                message = "Needs improvement.";
                break;
            case 'F':
                message = "Failed.";
                break;
            default:
                message = "Invalid grade.";
        }
        System.out.println("Grade " + grade + ": " + message);

      
        System.out.println("\n--- String switch ---");
        String command = "START";

        switch (command) {
            case "START":
                System.out.println("Starting system...");
                break;
            case "STOP":
                System.out.println("Stopping system...");
                break;
            case "REBOOT":
                System.out.println("Rebooting...");
                break;
            default:
                System.out.println("Unknown command.");
        }
    }


}