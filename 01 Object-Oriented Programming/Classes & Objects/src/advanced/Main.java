package advanced;

import beginner.Order;

public class Main {
    public static void main(String[] args) {
        
        Customer alice = new VIPCustomer("Alice");
        Customer bob = new VIPCustomer("Bob");

        Order order1 = new Order("MacBook", 1, 2000.0);
        Order order2 = new Order("Phone", 2, 500.0);

        alice.placeOrder(order1);
        bob.placeOrder(order2);

        if (alice.getName() == bob.getName()) {
            System.out.println("Same customer!");
        } else {
            System.out.println("Different customers.");
        }

        for (int i = 0; i <= 2; i++){
            System.out.println("Order #" + i);
        }
    }
}
