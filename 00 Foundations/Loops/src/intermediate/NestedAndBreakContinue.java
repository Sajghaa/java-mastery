package intermediate;

public class NestedAndBreakContinue {
    public static void main(String[] args) {
        
        System.out.println("--- Nested Loops: Multiplication Table ---");

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
        System.out.println("\n--- BREAK: Stop at 10 ---");
        for (int i = 1; i <= 20; i++){
            if (i == 10) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n--- CONTINUE: Print only odd numbers ---");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Odd number: " + 1);
        }

        System.out.println("\n--- INFINITE LOOP: Simulate until 5---");

        int counter = 0;
        while (true) {
            counter++;
            System.out.println("Counter: " + counter);
            if (counter == 5) {
                System.out.println("Reached 5, breaking the infinite loop");
                break;
            }
        }
    }

    
}
