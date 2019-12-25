package enums;

public enum  BackingTechniqueType {
    CRISPY(0.9),
    CHEWY(1.0),
    HOMEMADE(1.1);

    private double modifier;

    BackingTechniqueType (double modifier){
        this.modifier = modifier;
    }

    public double getModifier() {
        return this.modifier;
    }
}
