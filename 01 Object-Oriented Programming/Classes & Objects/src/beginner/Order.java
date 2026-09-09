package beginner;

import java.util.UUID;

public class Order {

     private String id;
     private String itemName;
     private int quantity;
     private double pricePerUnit;

     public  Order(String itemName, int quantity, double pricePerUnit) {

        this.id = UUID.randomUUID().toString().substring(0, 8);

        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
     }

     public String getId() {
        return id;
     }

     public String getItemName() {
        return itemName;
     }

     public int getQuantity(){
        return quantity;
     }

     public  double getPricePerUnit() {
        return pricePerUnit;
     }

     public  double getTotalAmount() {
        return this.quantity * this.pricePerUnit;
     }

     @Override 
     public  String toString() {
        return  "Order{id='" + id + "', item='" + itemName + "', total=" + getTotalAmount() + "}";
     }

}