package beginner;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("--- Method overloading ---");

        System.out.println("add(int, int): " + add(5, 3));           
        System.out.println("add(double, double): " + add(5.5, 3.2));
        System.out.println("add(int, double): " + add(5, 3.5));      
        System.out.println("add(String, String): " + add("Hello", " World")); 

        System.out.println("\n--- Overloading by count ---");
        System.out.println("max(5, 3): " + max(5, 3));
        System.out.println("max(5, 3, 7): " + max(5, 3, 7));

        System.out.println("\n--- Overloading by type ---");
        System.out.println("format(42): " + format(42));
        System.out.println("format(3.14): " + format(3.14));
        System.out.println("format(\"Java\"): " + format("Java"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c); 
    }

    public static String format(int value) {
        return "Integer: " + value;
    }

    public static String format(double value) {
        return "Double: " + value;
    }

    public static String format(String value) {
        return "String: " + value;
    }

}