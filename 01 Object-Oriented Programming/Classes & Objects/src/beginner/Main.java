package beginner;

public class Main{

    public static void main(String[] args) {
        
        System.out.println("--- Creating Customers ---");
        Customer alice = new Customer("Alice", true);
        Customer bob = new Customer("Bob", false);
        System.out.println("Alice created (VIP: " + alice.isVip() + ")");
        System.out.println("Bob created (VIP: " +bob.isVip() +")");

        System.out.println("\n--- Creating Orders ---");
        Order order1 = new Order("MacBook Pro", 1, 2499.99);
        Order order2 = new Order("AirPods", 2, 249.00);
        Order order3 = new Order("Coffee Mug", 3, 15.99);

        System.out.println("Order 1: " + order1);
        System.out.println("Order 2: " + order2);
        System.out.println("Order 3: " + order3);

        System.out.println("\n--- Placing Orders ---");
        alice.placeOrder(order1);
        alice.placeOrder(order2);
        bob.placeOrder(order3);

        System.out.println("\n--- After placing Orders ---");
        System.out.println("Alice's loyalty points: " + alice.getLoyaltyPoints());
        System.out.println("Alice's balance: $" + alice.getBalance());
        System.out.println("Bob's loyalty points" + bob.getLoyaltyPoints());
        System.out.println("Bob's balance: $" + bob.getBalance());
        System.out.println("\n--- Alice's Orders ---");
        alice.printOrders();
        System.out.println("\n--- Bob's Orders ---");
        bob.printOrders();

        System.out.println("\n--- Edge Case: Null Order ---");
        alice.placeOrder(null);

        System.out.println("\n--- Immutability: We can't change Alice's VIP status ---");
        System.out.println("\n--- Object Independence ---");
        Customer anotherAlice = new Customer("Alice", true);
        System.out.println("Are they the same object? " + (alice == anotherAlice));

    }
}