public class ArithmeticAndRelational{

    public static void main(String[] args) {
        
        int a = 25, b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b: " + (a > b));
        System.out.println("a == 25: " + (a == 25));
        System.out.println("a != b: " + (a != b));

        boolean isSunny = true;
        boolean isWarm = false;
        System.out.println("Sunny AND Warm: " + (isSunny && isWarm));
        System.out.println("Sunny OR Warm: " + (isSunny || isWarm));
        System.out.println("NOT Sunny: " + (!isSunny));

        int count = 0;
        System.out.println("count++: " + count++); 
        System.out.println("++count: " + ++count); 
        System.out.println("count--: " + count--);
    }
}