package needforspeed;

public class RaceMotorcycle extends MotorCycle {
    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(8);
    }
}
