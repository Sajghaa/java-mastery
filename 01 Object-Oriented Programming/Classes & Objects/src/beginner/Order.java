package beginner;

import java.util.UUID;

public class Order {
    
    private String id;
    private String itemName;
    private int quantity;
    private double pricePerUnit;
    private double discountRate;

    public Order(String itemName, int quantity, double pricePerUnit, double getTotalAmount) {

        this.id = UUID.randomUUID().toString().substring(0, 8);
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.discountRate = discountRate;
    }

    public double getTotalAmount(){
        return this.quantity * this.pricePerUnit * (1 - this.discountRate);
    }

    @Override
    public String toString(){
        return "Order{id='" + id + "', item='" + itemName + "', total=" + getTotalAmount() + "}";
    }
    
}
