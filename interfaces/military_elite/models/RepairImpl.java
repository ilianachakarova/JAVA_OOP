package abstraction_and_interfaces.military_elite.models;

public class RepairImpl implements Repair {
    private String part;
    private int hoursWorked;

    public RepairImpl(String part, int hoursWorked){
        this.part = part;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part name: %s Hours worked: %d",this.part,this.hoursWorked);
    }
}
