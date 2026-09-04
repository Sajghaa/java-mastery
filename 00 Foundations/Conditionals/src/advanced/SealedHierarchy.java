package advanced;

public class SealedHierarchy {

    public static void main(String[] args) {

        System.out.println("--- Exhaustive switch (no default needed) ---");
        Vehicle car = new Car(5);
        Vehicle bike = new Bike(true);
        Vehicle truck = new Truck(5000.0);

        describeVehicle(car);
        describeVehicle(bike);
        describeVehicle(truck);

        System.out.println("\n--- Adding a new type breaks the switch ---");
        System.out.println("Uncomment 'new Electric(100)' and see the compiler error!");

        System.out.println("\n--- Sealed records (cleaner syntax) ---");
        Result success = new Success("User created successfully");
        Result error = new Error("Invalid email");
        Result loading = new Loading();

        handleResult(success);
        handleResult(error);
        handleResult(loading);
    }

    sealed interface Vehicle permits Car, Bike, Truck {}

    record Car(int seats) implements Vehicle {}
    record Bike(boolean hasCarrier) implements Vehicle {}
    record Truck(double capacity) implements Vehicle {}

    public static void describeVehicle(Vehicle v) {
        String description = switch (v) {
            case Car c -> "Car with " + c.seats() + " seats";
            case Bike b -> "Bike with " + (b.hasCarrier() ? "" : "no ") + "carrier";
            case Truck t -> "Truck with " + t.capacity() + " kg capacity";
        };
        System.out.println(description);
    }


    sealed interface Result permits Success, Error, Loading {}

    record Success(String message) implements Result {}
    record Error(String error) implements Result {}
    record Loading() implements Result {}

    public static void handleResult(Result result) {
        String output = switch (result) {
            case Success s -> "Success: " + s.message();
            case Error e -> "Error: " + e.error();
            case Loading l -> "Still loading...";
        };
        System.out.println(output);
    }
}
