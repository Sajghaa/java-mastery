package advanced;

public class PatternMatching {

    public static void main(String[] args) {

        System.out.println("--- Pattern matching in `if` ---");
        Object obj1 = "Hello, Java!";
        Object obj2 = 42;
        Object obj3 = null;

        printLength(obj1);
        printLength(obj2);
        printLength(obj3);

        System.out.println("\n--- Pattern matching in `switch` ---");
        describe(obj1);
        describe(obj2);
        describe(3.14);
        describe(null);

        // ----- SCENARIO 3: Pattern matching with custom classes -----
        System.out.println("\n--- Pattern matching with custom classes ---");
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);
        Shape shape3 = new Triangle(3.0, 4.0);

        printArea(shape1);
        printArea(shape2);
        printArea(shape3);

        System.out.println("\n--- Pattern matching with exact values ---");
        String token = "RESET";
        String action = handleCommand(token);
        System.out.println("Action: " + action);
    }

    public static void printLength(Object obj) {
        if (obj == null) {
            System.out.println("Null value");
        } else if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else {
            System.out.println("Not a String");
        }
    }

    public static void describe(Object obj) {
        String result = switch (obj) {
            case null -> "Null value";
            case String s -> "String: " + s + " (length " + s.length() + ")";
            case Integer i -> "Integer: " + i;
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }


    public static void printArea(Shape shape) {
        String result = switch (shape) {
            case Circle c -> "Circle area: " + String.format("%.2f", Math.PI * c.radius() * c.radius());
            case Rectangle r -> "Rectangle area: " + String.format("%.2f", r.width() * r.height());
            case Triangle t -> "Triangle area: " + String.format("%.2f", 0.5 * t.base() * t.height());
        };
        System.out.println(result);
    }

    public static String handleCommand(String cmd) {
        return switch (cmd) {
            case "START" -> "Starting system...";
            case "STOP" -> "Stopping system...";
            case "RESET" -> "Resetting system...";
            default -> "Unknown command: " + cmd;
        };
    }



    sealed interface Shape permits Circle, Rectangle, Triangle {}

    record Circle(double radius) implements Shape {}
    record Rectangle(double width, double height) implements Shape {}
    record Triangle(double base, double height) implements Shape {}
}
