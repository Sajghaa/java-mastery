package beginner;

public class GuardClausesIntro {
    
    public static void main(String[] args) {
        
        System.out.println("--- UGLY: Nested validation (DEEP) ---");
        processOrderUgly(null, "pass123");

        System.out.println("\n--- CLEAN: Guard clauses (FLAT) ---");
        processOrderClean(null, "pass123");
    }

    public static void processOrderUgly(String email, String password) {
        if (email != null) {
            if (password != null) {
                if (password.length() >= 6){
                    System.out.println("Order processed successfully!");
                } else {
                    System.out.println("Password too short");
                }
            } else {
                System.out.println("Password is required");
            }
        } else {
            System.out.println("Email is required.");
        }
    }

    public static void processOrderClean(String email, String password) {

       
        if (email == null) {
            System.out.println("Email is required");
            return;
        }

        if (password == null) {
            System.out.println("Password is required.");
            return;
        }

        System.out.println("Order processed successfully!");
    }
}
