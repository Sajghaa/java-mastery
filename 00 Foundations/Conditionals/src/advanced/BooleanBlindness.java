package advanced;

public class BooleanBlindness {
    
    public static void main(String[] args) {
        
        calculatePriceUgly(100.0, true);
        calculatePriceUgly(100.0, false);


        System.out.println("\n--- CLEAN: Self-documenting enums ---");
        calculatePriceClean(100.0, DiscountType.STUDENT);
        calculatePriceClean(100.0, DiscountType.NONE);
        calculatePriceClean(100.0, DiscountType.VIP);

        System.out.println("\n--- Multiple booleans (UGLY) ---");

        processOrder(true, false, true);

        System.out.println("\n--- CLEAN with enums ---");
        processOrderClean(ShippingPriority.EXPRESS, OrderType.PHYSICAL);
        processOrderClean(ShippingPriority.STANDARD, OrderType.DIGITAL);

        System.out.println("\n--- Null boolean (the trap) ---");

        Boolean isActive = null;
    }

    public static void calculatePriceUgly(double basePrice, boolean isStudent) {
        double finalPrice;
        if (isStudent) {
            finalPrice = basePrice * 0.9;
            System.out.println("Student price: $" + finalPrice);
        } else {
            finalPrice = basePrice;
            System.out.println("Regular price: $" + finalPrice);
        }
    }

    enum DiscountType {
        NONE(1.0),
        STUDENT(0.9),
        SENIOR(0.85),
        VIP(0.8);

        private final double multiplier;

        DiscountType(double multiplier) {
            this.multiplier = multiplier;
        }

        public double apply(double basePrice) {
            return basePrice * multiplier;
        }
    }

    public static void calculatePriceClean(double basePrice, DiscountType discountType) {
        double finalPrice = discountType.apply(basePrice);
        System.out.println("Price with " + discountType + " discount: $"+ finalPrice);
    }

    public static void processOrder(boolean isExpress, boolean isInternational, boolean isGift) {

        System.out.println("Processing order... (with 3 booleans)");
    }

    enum ShippingPriority { STANDARD, EXPRESS, OVERNIGHT }
    enum OrderType { PHYSICAL, DIGITAL, SERVICE }

    public static void processOrderClean(ShippingPriority shipping, OrderType orderType) {
        System.out.println("Processing " + orderType + " order with " + shipping + " shipping.");
    }
}
