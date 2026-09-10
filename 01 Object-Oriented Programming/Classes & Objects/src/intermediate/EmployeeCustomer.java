package intermediate;

import beginner.Order;

public class EmployeeCustomer extends Customer {

    public  EmployeeCustomer(String name) {
        super(name);
    }
    @Override 
    protected  int calculatePoints(double total) {
        int basePoints = super.calculatePoints(total);
        return basePoints * 3;
    }

    @Override 
    protected  double calculateTotal(Order order) {
        double originalTotal = super.calculateTotal(order);
        return originalTotal * 0.5;
    }
    
}
