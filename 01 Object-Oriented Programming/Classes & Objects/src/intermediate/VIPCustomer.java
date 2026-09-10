package intermediate;

public class VIPCustomer extends Customer{

    public  VIPCustomer(String name) {
        super(name);
    }

    @Override 
    protected int calculatePoints(double total) {
        int basePoints = super.calculatePoints(total);
        return basePoints * 2;
    }

    public  void requestFreeShipping() {
        System.out.println(name + " requested free shipping (VIP benefit).");
    }
    
}
