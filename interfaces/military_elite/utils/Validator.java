package abstraction_and_interfaces.military_elite.utils;

import abstraction_and_interfaces.military_elite.enums.Corps;
import abstraction_and_interfaces.military_elite.enums.MissionState;

public class Validator {
    private Validator(){

    }

    public static void validateCorps(String corps){
        if(!corps.equals(Corps.AIRFORCE.getName()) && !corps.equals(Corps.MARINES.getName())){
            throw new IllegalArgumentException("Invalid corps");
        }
    }

    public static boolean validateMissionState(String state) {
        if(!state.equals(MissionState.FINISHED.getState())
                && !state.equals(MissionState.IN_PROGRESS.getState())){
           return false;
        }
        return true;
    }
}
