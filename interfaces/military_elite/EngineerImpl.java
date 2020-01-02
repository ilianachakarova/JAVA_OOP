package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.enums.Corps;
import abstraction_and_interfaces.military_elite.interfaces.Engineer;
import abstraction_and_interfaces.military_elite.models.Repair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EngineerImpl extends SpecializedSoldierImpl implements Engineer {

    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps, Repair... repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs != null ?
                Arrays.asList(repairs) : new ArrayList<Repair>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());

        sb.append("Corps: " + this.getCorps().getName()).append(System.lineSeparator());
        sb.append("Repairs:").append(System.lineSeparator());
        for (Repair repair : repairs) {
            sb.append(repair.toString()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
