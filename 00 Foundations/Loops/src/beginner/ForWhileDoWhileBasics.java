
public class ForWhileDoWhileBasics {
    
    public static void main(String[] args) {
        System.out.println("--- FOR Loop: Print 1 to 5 ---");
        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int idx = 0; idx < numbers.length; idx++){
            sum += numbers[idx];
        }
        
        System.out.println("Sum of array (for loop): " + sum);
        System.out.println("\n--- WHILE Loop: Print 1 to 5 ---");
        int j = 1;
        while (j <= 5){
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\n--- WHILE Loop: Search for '42' in array---");
        int[] data = {10, 20, 42, 30, 50};
        int target = 42;
        int index = 0;
        boolean found = false;
        while (index < data.length && !found){
            if (data[index] == target){
                found = true;
                System.out.println("Found " + target + " at index " + index);
            }
            index++;
        }

        System.out.println("\n--- DO-WHILE Loop: At least one print ---");
        int k = 10;
        do {
            System.out.println("k = " + k +"(runs even if conditions false)");
            k++;
        } while (k <= 5);
    }
}
