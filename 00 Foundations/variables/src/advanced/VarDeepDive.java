
import java.util.*;
import java.util.function.*;

public class VarDeepDive {
    
    enum Status { PENDING, APPROVED, REJECTED}

    public static void main(String[] args) {
        var complexMap = new HashMap<String, List<Map<Integer, String>>>(){{
            put("Key1", new ArrayList<>(List.of(Map.of(1, "one"))));
        }};
        System.out.println("Complex map: " + complexMap);

        IntUnaryOperator fn = x -> x + 1;
        var result = fn.applyAsInt(5);
        System.out.println("Lambda result: " + result);

        int effectivelyFinal = 100;

        Runnable r = () -> System.out.println(effectivelyFinal);
        r.run();

        int flags = 0b1010;
        int mask = 0b0011;
        int and = flags & mask;
        int or = flags | mask;
        int xor = flags ^ mask;
        int shifted = flags << 2;

        System.out.printf("Bitwise: AND=%d, XOR=%d, SHIFT=%d\n", and, or, xor, shifted);

        Status status = Status.APPROVED;
        System.out.println("Current status:" + status);
    }

}
