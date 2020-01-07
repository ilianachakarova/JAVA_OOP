package Vehicles;

public class Bus extends VehicleImpl {
    public static final double OCCUPIED_CONSUMPTION = 1.4;
    private boolean occupied;
    public Bus(double fuelQuantity, double consumption, double tankCapacity) {
        super(fuelQuantity, consumption,tankCapacity);
        this.occupied = false;
    }

    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    @Override
    public void drive(double distance) {
        if(this.occupied) {
            super.setConsumption(OCCUPIED_CONSUMPTION);
        }
        System.out.print("Bus ");
        super.drive(distance);
        this.setOccupied(false);


    }

    @Override
    public String toString() {
        return "Bus: " + super.toString();
    }
}
