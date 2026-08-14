package beginner;

public class VariablesPlayground {
    public static void main(String[] args) {
        
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 2_000_000_000;

        long myLong = 9_000_000_000L;

        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        short overflowShort = (short)(Short.MAX_VALUE + 1);
        System.out.println("Overflow short: " + overflowShort);

        int overflowInt = Integer.MAX_VALUE +1;
        System.out.println("Overflow int: " + overflowInt);

        float myFloat = 3.14f;
        double myDouble = 3.14159265359;
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        float fPrecision = 1.23456789f;
        double dPrecision = 1.2345678901234567;
        System.out.println("float precision: " + fPrecision);
        System.out.println("double precision: " + dPrecision);

        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("char example: " + myChar + "(number value: " + (int)myChar + ")");
        System.out.println("boolean values: " + true + " or " + false);

        int bigNumber = 1000;
        byte smallNumber = (byte) bigNumber;
        System.out.println("Casted byte from 1000: " + smallNumber);

    }
}
