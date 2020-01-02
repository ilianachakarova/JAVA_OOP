package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator()
                + "Code Number: " + this.codeNumber;
    }
}
