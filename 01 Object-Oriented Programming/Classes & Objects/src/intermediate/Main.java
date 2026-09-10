package intermediate;

import java.util.ArrayList;
import java.util.List;

import beginner.Order;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("--- Creating Customers ---");

        RegularCustomer bob = new RegularCustomer("bob");
        VIPCustomer  alice = new VIPCustomer("Alice");
        EmployeeCustomer charlie = new EmployeeCustomer("Charlie");

        System.out.println("\n--- Creating Orders ---");
        Order order1 = new Order("MacBook Pro", 1, 1000.00);
        Order order2 = new Order("AirPods", 2, 250.00);
        Order order3 = new Order("Coffee Mug", 3, 20.00);

        System.out.println("\n--- Placing Orders ---");
        bob.placeOrder(order1);
        alice.placeOrder(order1);
        charlie.placeOrder(order1);

        System.out.println("\n--- Polymorphism: Treating All Types Uniformly --");

        List<Customer> customers = new ArrayList<>();
        customers.add(new RegularCustomer("Dave"));
        customers.add(new VIPCustomer("Eve"));
        customers.add(new EmployeeCustomer("Frank"));

        Order sharedOrder = new Order("Shared Item", 1, 100.00);

        for (Customer c: customers) {
            c.placeOrder(sharedOrder);
        }

        System.out.println("\n--- Order Histories ---");
        bob.printOrders();
        alice.printOrders();
        charlie.printOrders();

        System.out.println("\n--- Subclass-Specific Behavior ---");
        alice.requestFreeShipping();

        System.out.println("\n--- Downcasting (with instanceof check) ---");
        Customer someCustomer = new VIPCustomer("Grace");

        if (someCustomer instanceof VIPCustomer vip) {
            vip.requestFreeShipping();
        }

        System.out.println("\n--- toString() Polymorphism ---");
        System.out.println(bob);

        System.out.println(alice);
        System.out.println(charlie);

    }

}
