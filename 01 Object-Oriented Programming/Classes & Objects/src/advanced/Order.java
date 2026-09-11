package advanced;

public class Order {
    
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public  Order(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalAmount() {
        return  quantity * pricePerUnit;
    }

    @Override 
    public String toString() {
        return "Order{item='" + itemName + "', total=" + getTotalAmount() + "}";
    }

}
