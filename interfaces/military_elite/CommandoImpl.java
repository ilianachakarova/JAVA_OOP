package abstraction_and_interfaces.military_elite;

import abstraction_and_interfaces.military_elite.enums.Corps;
import abstraction_and_interfaces.military_elite.interfaces.Commando;
import abstraction_and_interfaces.military_elite.models.Mission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CommandoImpl extends SpecializedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps, Mission... missions) {
        super(id, firstName, lastName, salary, corps);
        this.missions =
                missions != null ? Arrays.asList(missions) : new ArrayList<>();
    }


    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(System.lineSeparator());
        sb.append("Corps: " + this.getCorps().getName()).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        for (Mission mission : missions) {
            sb.append(" " + mission.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
