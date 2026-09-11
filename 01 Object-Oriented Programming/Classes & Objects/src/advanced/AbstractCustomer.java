package advanced;

import java.util.ArrayList;
import java.util.List;

import beginner.Order;

public class AbstractCustomer implements Discountable {

    protected  String name;
    protected int loyaltyPoints;
    protected  double balance;
    private List<Order> orders;

    public  AbstractCustomer(String name) {
        this.name = name;
        this.loyaltyPoints = 0;
        this.balance = 0.0;
        this.orders = new ArrayList<>();
    }
    
    public  String getName() { return name; }
    public  int getLoyaltyPoints() { return loyaltyPoints; }
    public  double getBalance() { return balance; }

    protected abstract int calculatePoints(double total);

    protected abstract double calculateTotal(Order order);

    public void placeOrder(Order order) {
        if (order == null) {
            System.out.println("Order cannot be null!");
            return;
        }

        double total = calculateTotal(order);
        this.balance += total;
        int points = calculatePoints(total);
        this.loyaltyPoints += points;

        addOrder(order);
        
        System.out.printf("%s placed an order. Total: $%2.f. Points earned: %d%n", name, total, points);
    }

    protected final void addOrder(Order order) {
        this.orders.add(order);
    }

    public final void printOrders() {
        if (orders.isEmpty()) {
            System.out.println(name + "has no orders yet.");
            return;
        }
        System.out.println("---" + name + "'s Orders ---");
        for (Order o: orders) {
            System.out.println(" -> " + o);
        }
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{name='" + name + "', points=" + loyaltyPoints + ", balance=" + balance + "}";

    }

}
