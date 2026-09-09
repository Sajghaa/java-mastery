package beginner;

public class ParameterPassing {

    public static void main(String[] args) {
        System.out.println("--- Primitive parameter ---");
        int x = 10;
        System.out.println("Before: x = " + x);
        tryToModifyPrimitive(x);
        System.out.println("After: x = " + x); 

        System.out.println("\n--- Reference parameter (modify object) ---");
        Person person = new Person("Alice", 25);
        System.out.println("Before: " + person);
        modifyPersonAge(person, 30);
        System.out.println("After: " + person); 

        System.out.println("\n--- Reference parameter (reassign) ---");
        Person anotherPerson = new Person("Bob", 20);
        System.out.println("Before: " + anotherPerson);
        tryToReassignPerson(anotherPerson);
        System.out.println("After: " + anotherPerson); 

        System.out.println("\n--- String (immutable) ---");
        String str = "Hello";
        System.out.println("Before: " + str);
        tryToModifyString(str);
        System.out.println("After: " + str);

    }

    public static void tryToModifyPrimitive(int value) {
        value = 42; 
        System.out.println("Inside method: value = " + value);
    }

    public static void modifyPersonAge(Person p, int newAge) {
        p.age = newAge; 

    }

    public static void tryToReassignPerson(Person p) {
        p = new Person("Charlie", 40); 
        
        System.out.println("Inside method: p = " + p);
    }

    public static void tryToModifyString(String s) {
        s = s + " World"; 
        System.out.println("Inside method: s = " + s);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

}
