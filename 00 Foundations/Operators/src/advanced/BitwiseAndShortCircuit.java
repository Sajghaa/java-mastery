import java.util.ArrayList;
import java.util.List;


public class BitwiseAndShortCircuit {
    public static void main(String[] args) {
        int x = 0b1100; // 12
        int y = 0b1010; // 10
        System.out.println("x & y = " + (x & y) + " (binary 1000)"); // 8
        System.out.println("x | y = " + (x | y) + " (binary 1110)"); // 14
        System.out.println("x ^ y = " + (x ^ y) + " (binary 0110)"); // 6
        System.out.println("~x = " + (~x) + " (two's complement)");   // -13

        int value = -8;
        System.out.println("-8 >> 1 = " + (value >> 1));   
        System.out.println("-8 >>> 1 = " + (value >>> 1)); 

        List<String> list = null;
        
        if (list != null && list.size() > 0) {
            System.out.println("Not empty");
        } else {
            System.out.println("List is null or empty (safe)");
        }

        int a = 10;
        if (a == 10 | (a++) > 5) {  
            System.out.println("a after non-SC: " + a); 
        }

        Object obj = new ArrayList<String>();
        if (obj instanceof List) {
            System.out.println("obj is a List");
        }
    
    }
}