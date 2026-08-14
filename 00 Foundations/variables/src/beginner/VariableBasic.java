package beginner;

public class VariableBasic {
    public static void main(String[] args) {
    byte myByte = 100;
    short myShort = 30000;
    int myInt = 2_000_000_000;

    long myLong = 9_000_000_000L;
    float myFloat = 3.14f;
    double myDouble = 3.141592655359;
    char myChar = 'A';
    boolean myBoolean = true;

    String message = "Java Mastery";

    System.out.println("byte: " + myByte);
    System.out.println("short: " + myShort);
    System.out.println("int:" + myInt);
    System.out.println("long: "+ myLong);
    System.out.println("float: " + myFloat);
    System.out.println("double: " + myDouble);
    System.out.println("char: "+ myChar);
    System.out.println("boolean: " +myBoolean);
    System.out.println("String: " + message);

    if (true) {
        int blockScoped = 42;
        System.out.println("blocked = "+ blockScoped);
    }
    // System.out.println(blockedScoped); // this will compile error
    }    


}
