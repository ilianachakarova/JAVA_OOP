package abstraction_and_interfaces.military_elite.interfaces;

import abstraction_and_interfaces.military_elite.models.Mission;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);
    Collection<Mission> getMissions();
}
