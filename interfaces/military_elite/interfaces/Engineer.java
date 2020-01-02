package abstraction_and_interfaces.military_elite.interfaces;

import abstraction_and_interfaces.military_elite.models.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);
    Collection<Repair> getRepairs();
}
