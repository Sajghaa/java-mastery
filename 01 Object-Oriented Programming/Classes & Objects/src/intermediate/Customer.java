package intermediate;

import beginner.Order;

import java.util.ArrayList;
import java.util.List;



public class Customer {
    
    protected String name;
    protected int loyaltyPoints;
    protected  double balance;
    private List<Order> orders;

    public  Customer(String name){
        this.name = name;
        this.loyaltyPoints = 0;
        this.balance = 0.0;
        this.orders = new ArrayList<>();
    }

    public  String getName(){
        return name;
    }

    public  int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public  double getBalance() {
        return balance;
    }

    public  void placeOrder(Order order) {
        if (order == null) {
            System.out.println("Order cannot be null!");
            return;
        }

        double total = calculateTotal(order);
        this.balance += total;

        int pointsEarned = calculatePoints(total);
        this.loyaltyPoints += pointsEarned;

        addOrder(order);
        System.out.printf("%s placed an order. Total: $%.2f. Points earned %d%n", name, total, pointsEarned);
    }


    protected  double calculateTotal(Order order) {
        return order.getTotalAmount();
    }

    protected  int calculatePoints(double total) {
        return  (int) total;
    }

    protected  final void addOrder(Order order ) {
        this.orders.add(order);
    }

    public  final void printOrders() {
        if (orders.isEmpty()) {
            System.out.println(name + "has no orders yet.");
            return;
        }

        System.out.println("--- " + name + "'s Orders ---");
        for (Order o: orders) {
            System.out.println(" -> " + o);
        }
    }

    @Override 
    public  String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', points=" + loyaltyPoints + ", balance=" + balance + "}";
    }
}
