package TypeCastingAndInference;
public class TypeCastingAndInference {
    

    int defaultInt;
    double defaultDouble;
    boolean defaultBoolean;
    String defaultString;

    public static void main(String[] args) {
        
        byte b = 42;
        int i = b;
        long l = i;
        float f = 1;

        double d = f;

        System.out.println("Widened: " + d);

        double pi = 3.14159;
        int intPi = (int) pi;
        short shortPi = (short) intPi;

        System.out.println("Narrowed pi = " + intPi);

        int maxInt = Integer.MAX_VALUE;
        int overflowed = maxInt + 1;
        System.out.println("Overflowed: " + overflowed);

        var name = "Elite Java";
        var count = 10;
        var list = java.util.List.of(1, 2, 3);

        System.out.println(name + " has " + count +  " items: " + list);

        TypeCastingAndInference obj = new TypeCastingAndInference();
        System.out.println("Default int: " + obj.defaultInt);
        System.out.println("Default double: " + obj.defaultDouble);
        System.out.println("Default boolean:" + obj.defaultBoolean);
        System.out.println("Default String: " + obj.defaultString);

    }

}
