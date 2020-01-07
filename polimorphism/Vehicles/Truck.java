package Vehicles;

public class Truck extends VehicleImpl {
    public Truck(double fuelQuantity, double consumption, double tankCapacity) {
        super(fuelQuantity, consumption + 1.6,tankCapacity);
    }

    @Override
    public void drive(double distance) {
        System.out.print("Truck ");
        super.drive(distance);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters*0.95);
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
