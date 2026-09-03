package beginner;

public class SwitchFallthrough {

    public static void main(String[] args) {
        
        System.out.println("--- Intentional fall-through ---");
        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("Month " + month + " is in " + season);

        System.out.println("\n--- DANGEROUS: Accidental fall-through ---");

        int code = 2;
        String result;

        switch (code) {
            case 1:
                result = "One";
            
            case 2:
                result = "Two";
            
            case 3:
                result = "Three";
                break;
            
            default:
                result = "Other";
        }
        System.out.println("Code " + code + " is " + result);

        System.out.println("\n--- Safe fall-through ");

        int dayOfWeek = 6;
        String type;


        switch ( dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                type = "Weekday";
                break;
            case 6:
            case 7:
                type = "Weekend";
                break;        
            default:
                type = "Invalid";
        }

        System.out.println("Day " + dayOfWeek + " is a " + type);
    }
    
}
