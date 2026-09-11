package advanced;

import beginner.Order;

public class VIPCustomer extends Customer {
    
    private String name;

    public  VIPCustomer(String name) {
        super(name);
        this.name = name;
    }

    @Override 
    protected int calculatePoints(double total) {
        return (int) total * 2;
    }

    @Override 
    protected double calculateTotal(Order order) {
        return order.getTotalAmount() * 0.9;
    }

    public String getName() {
        return name;
    }
}
