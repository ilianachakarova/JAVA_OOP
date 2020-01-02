package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.enums.Corps;
import abstraction_and_interfaces.military_elite.interfaces.SpecializedSoldier;

public abstract class SpecializedSoldierImpl extends PrivateImpl implements SpecializedSoldier {
    private Corps corps;

    public SpecializedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public Corps getCorps() {
        return this.corps;
    }
}
