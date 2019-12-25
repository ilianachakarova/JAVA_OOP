package pizza;

import enums.BackingTechniqueType;
import enums.DoughType;
import utils.ValidatorUtil;

public class Dough extends FoodProduct {
    private DoughType flourType;
    private BackingTechniqueType backingTechnique;

    public Dough(String dough, String bakingTechnique, double weight) {
        super(weight);
        ValidatorUtil.validateDoughWeight(weight);
        this.setDough(dough);
        this.backingTechnique = BackingTechniqueType.valueOf(bakingTechnique.toUpperCase());
    }

    private void setDough(String dough) {
       try{
           this.flourType = DoughType.valueOf(dough.toUpperCase());
       }catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("Invalid type of dough");
       }
    }

    @Override
    public double calculateCalories() {
        double calories = super.calculateCalories();

        calories *= this.flourType.getModifier();
        calories *= this.backingTechnique.getModifier();

        return calories;
    }
}
