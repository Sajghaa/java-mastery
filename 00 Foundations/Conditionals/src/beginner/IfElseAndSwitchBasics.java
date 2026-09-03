package beginner;

public class IfElseAndSwitchBasics {

    public static void main(String[] args) {
        
        System.out.println("--- UGLY: Deeply nested if-else ---");
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

        System.out.println("\n--- CLEAN: Flat if-else with guard clause--");

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


        System.out.println("\n--- Traditional switch ---");
        int day = 4;
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

        System.out.println("\n--- Fall-through ---");
        int month = 9;
        int daysInMonth;


        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;

            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;

            case 2:
                daysInMonth = 28; // Ignoring leap year for simplicity
                break;

            default:
                daysInMonth = -1;
        }

        System.out.println("Days in month " + month + ": " + daysInMonth);

    }
    
}
