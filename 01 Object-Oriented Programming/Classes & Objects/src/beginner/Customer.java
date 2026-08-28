package beginner;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int loyaltyPoints;
    private double balance;
    private boolean isVip;
    private List<Order> orders;

    public Customer(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
        this.loyaltyPoints = 0;
        this.balance = 0.0;
        this.orders = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getLoyalityPoints(){
        return loyaltyPoints;
    }

    public double getBalance(){
        return balance;
    }

    public void placeOrder(Order order){
        if (order == null){
            System.out.println("Order cannot be null!");
            return;
        }

        double total = order.getTotalAmount();
        this.balance += total;

        int pointsEarned = isVip ? (int)(total * 2) : (int)total;
        this.loyaltyPoints += pointsEarned;
        orders.add(order);
        System.out.printf("Order placed by %s. Total:%2.f. Points earned: %d%n ", name, total, pointsEarned);
    }

    public void printOrders() {
        if (orders.isEmpty()){
            System.out.println("No orders yet.");
            return;
        }
        for (Order o : orders){
            System.out.println(" -> " + o);
        }
    }

}