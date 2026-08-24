package elite;

import java.util.concurrent.ThreadLocalRandom;


public class PerformanceAndJITOptimizations {

    public static strictfp void floatingPointDemo() {
        double d = 1.0 / 3.0;
        System.out.println("strictfp double: " + d);
    }

    public static void main(String[] args) {
        
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            sum += i * 2;   // likely optimised to i << 1
        }
        System.out.println("Sum with multiplication: " + sum + " (time: " + (System.nanoTime() - start) + " ns)");

        int n = 1_000_000;
        int mask = 15; 

        
        start = System.nanoTime();
        int modSum = 0;
        for (int i = 0; i < n; i++) {
            modSum += i % 16;
        }
        long modTime = System.nanoTime() - start;

      
        start = System.nanoTime();
        int andSum = 0;
        for (int i = 0; i < n; i++) {
            andSum += i & 15;
        }
        long andTime = System.nanoTime() - start;

        System.out.printf("Modulo time: %d ns, AND time: %d ns (AND is faster)\n", modTime, andTime);

        
        int a = Integer.MAX_VALUE;
        int b = 1;

        if (a > Integer.MAX_VALUE - b) {
            System.out.println("Overflow would occur! Using safe fallback.");
            long safe = (long) a + b;
            System.out.println("Safe result: " + safe);
        } else {
            System.out.println("Sum: " + (a + b));
        }

        int negative = -42;
        int abs = (negative ^ (negative >> 31)) - (negative >> 31);
        System.out.println("Branchless abs of -42: " + abs);

        int[] arr = {0, 1, 2, 3};
        int idx = 1;
        arr[idx] = idx = 3;  
        System.out.println("arr[1] = " + arr[1] + ", idx = " + idx);
        

        floatingPointDemo();
    }
}