package advanced;

public class GuardedPatterns {

    public static void main(String[] args) {
    
        System.out.println("--- Classifying numbers ---");
        classifyNumber(42);   
        classifyNumber(150);  
        classifyNumber(0);    
        classifyNumber(-5);   
        classifyNumber(3.14); 
        classifyNumber(null); 

        System.out.println("\n--- String processing with guards ---");
        processString("Hello");     
        processString("");          
        processString("   ");       
        processString("Secret123"); 
        processString(null);        

        
        System.out.println("\n--- Complex object classification ---");
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 17);
        Person person3 = new Person("", 30);

        classifyPerson(person1); 
        classifyPerson(person2); 
        classifyPerson(person3); 

        System.out.println("\n--- Multiple guards ---");
        Object value = 1000;
        String size = switch (value) {
            case Integer i when i < 0 -> "Negative";
            case Integer i when i == 0 -> "Zero";
            case Integer i when i > 0 && i <= 10 -> "Single digit";
            case Integer i when i > 10 && i <= 100 -> "Two-digit";
            case Integer i when i > 100 && i <= 1000 -> "Three-digit";
            case Integer i when i > 1000 -> "Large";
            default -> "Not an integer";
        };
        System.out.println("Size: " + size);
    }

    public static void classifyNumber(Object obj) {
        String result = switch (obj) {
            case null -> "Null value";
            case Integer i when i > 0 && i <= 100 -> "Positive integer (small)";
            case Integer i when i > 100 -> "Positive integer (large)";
            case Integer i when i == 0 -> "Zero";
            case Integer i when i < 0 -> "Negative integer";
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }

    public static void processString(Object obj) {
        String result = switch (obj) {
            case null -> "Null value";
            case String s when s.trim().isEmpty() -> "Empty or blank string";
            case String s when s.matches(".*\\d.*") -> "Contains digits: " + s;
            case String s -> "Normal string: " + s;
            default -> "Not a string";
        };
        System.out.println(result);
    }

    public static void classifyPerson(Object obj) {
        String result = switch (obj) {
            case null -> "Null person";
            case Person p when p.name == null || p.name.trim().isEmpty() -> "Invalid name";
            case Person p when p.age < 18 -> "Minor: " + p.name + " (" + p.age + ")";
            case Person p when p.age >= 18 -> "Adult: " + p.name + " (" + p.age + ")";
            default -> "Not a person";
        };
        System.out.println(result);
    }

    record Person(String name, int age) {}

}