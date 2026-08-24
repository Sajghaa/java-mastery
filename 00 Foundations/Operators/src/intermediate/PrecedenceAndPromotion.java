
public class PrecedenceAndPromotion {
    public static void main(String[] args) {
        
        int result = 2 + 3 * 4;      
        System.out.println("2 + 3 * 4 = " + result);

        // Force addition with parentheses
        result = (2 + 3) * 4;      
        System.out.println("(2 + 3) * 4 = " + result);

        byte b1 = 10, b2 = 20;
      
        int sum = b1 + b2;            
        System.out.println("byte sum promoted to int: " + sum);

        byte b = 50;
        b += 100;  
        System.out.println("b += 100 = " + b);  // -106 (overflow)

       
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status: " + status);


        System.out.println("1 + 2 = " + 1 + 2);   // "1 + 2 = 12" (string first)
        System.out.println("1 + 2 = " + (1 + 2)); // "1 + 2 = 3" (int first)
    }
}