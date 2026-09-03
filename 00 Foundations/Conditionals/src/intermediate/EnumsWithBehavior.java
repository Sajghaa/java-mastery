package intermediate;

public class EnumsWithBehavior {
    
    public static void main(String[] args) {
        
        System.out.println("--- UGLY: if-else on enum ---");
        UserRole role = UserRole.ADMIN;
        String permissionsUgly = getPermissionUgly(role);
        System.out.println("Permissions: " + permissionsUgly);

        System.out.println("\n--- CLEAN: Tell, Don't Ask ---");
        String permissionsClean = role.getPermissions();
        System.out.println("Permissions: " + permissionsClean);

        System.out.println("\n--- Complex behavior: Discounts ---");
        CustomerType customer = CustomerType.VIP;
        double basePrice = 100.0;
        double finalPrice = customer.applyDiscount(basePrice);
        System.out.println("Customer: " + customer + ", Price: $" + finalPrice);

        System.out.println("\n--- Enum with fields ---");
        for (HttpStatus status : HttpStatus.values()) {
            System.out.println(status.getCode() + ": " + status.getMessage());
        }

        System.out.println("\n--- Replacing long if-else chain ---");
        PaymentMethod payment = PaymentMethod.PAYPAL;

        payment.processPayment(150.0);
    }

    public static String getPermissionUgly(UserRole role) {
        if (role == UserRole.ADMIN) {
            return "Can read, write, delete";
        } else if (role == UserRole.USER) {
            return "Can read, write";
        } else if (role == UserRole.GUEST) {
            return "Can read only";
        } else {
            return "Unknown role";
        }
    }

    enum UserRole {
        ADMIN("Can read, write, delete"),
        USER("Can read, write"),
        GUEST("Can read only");

        private final String permissions;

        UserRole(String permissions) {
            this.permissions = permissions;
        }

        public String getPermissions() {
            return permissions;
        }
    }

    enum CustomerType {
        REGULAR {
            @Override
            public double applyDiscount(double price) {
                return price;
            }
        },
        MEMBER {
            @Override
            public double applyDiscount(double price) {
                return price * 0.9;
            }
        },
        VIP {
            @Override
            public double applyDiscount(double price) {
                return price * 0.8;
            }
        };

        public abstract double applyDiscount(double price);
    }

    enum HttpStatus {
        OK(200, "OK"),
        CREATED(201, "Created"),
        BAD_REQUEST(400, "Bad Request"),
        NOT_FOUND(404, "Not Found"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error");

        private final int code;
        private final String message;

        HttpStatus(int code, String message) {
            this.code = code ;
            this.message = message;
        }

        public int getCode() { return code; }
        public String getMessage() { return message; }

        public boolean isSucces() {
            return code >= 200 && code < 300;
        }
    }

    enum PaymentMethod {
        CREDIT_CARD {
            @Override
            public void processPayment(double amount) {
                System.out.println("Processing $" + amount + " via Credit Card.");
            }
        },
        PAYPAL {
            @Override
            public void processPayment(double amount) {
                System.out.println("Processing $" + amount + " via PayPal");
            }
        },
        CRYPTO {
            @Override
            public void processPayment(double amount) {
                System.out.println("Processing $" + amount + " via Cryptocurrency.");
            }
        };

        public abstract void processPayment(double amount);
    }
}
