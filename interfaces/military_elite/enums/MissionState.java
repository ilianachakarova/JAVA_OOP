package abstraction_and_interfaces.military_elite.enums;

public enum MissionState {
    IN_PROGRESS("inProgress"),
    FINISHED("Finished");

    private final String state;

    MissionState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
