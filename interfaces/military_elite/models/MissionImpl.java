package abstraction_and_interfaces.military_elite.models;

import abstraction_and_interfaces.military_elite.enums.MissionState;

public class MissionImpl implements Mission {
    private String name;
    private MissionState state;

    public MissionImpl(String name,MissionState state){
        this.name = name;
        this.state  = state;
    }

    public void completeMission(){
        this.state = MissionState.FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code name: %s State: %s",this.name,this.state.getState());
    }
}
