package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.interfaces.LieutenantGeneral;
import abstraction_and_interfaces.military_elite.interfaces.Soldier;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private List<Soldier> soldiers;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.soldiers = new ArrayList<>();
    }


    @Override
    public void addPrivate(Soldier p) {
        this.soldiers.add(p);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder =
                new StringBuilder(super.toString()).append(System.lineSeparator());


        stringBuilder.append("Privates:").append(System.lineSeparator());
        this.soldiers.sort((f, s) -> s.getId() - f.getId());

        for (Soldier soldier : soldiers) {
            stringBuilder.append(" " + soldier.toString()).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
