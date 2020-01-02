package abstraction_and_interfaces.military_elite.enums;

public enum Corps {
    AIRFORCE("Airforces"),
    MARINES("Marines");

    private final String name;

    Corps(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
