package pizza;

import enums.ToppingType;
import utils.ValidatorUtil;

public class Topping extends FoodProduct {
    private ToppingType toppingType;
    public Topping(String toppingType,double weight) {
        super(weight);
        this.setToppingType(toppingType);
        ValidatorUtil.validateToppingWeight(toppingType,weight);
    }

    private void setToppingType(String toppingType) {
        try{
            this.toppingType = ToppingType.valueOf(toppingType.toUpperCase());
        }catch (IllegalArgumentException ex){
            throw new IllegalArgumentException(String.format
                    ("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    @Override
    public double calculateCalories() {
       double calories = super.calculateCalories();

       calories *= this.toppingType.getModifier();

       return calories;
    }
}
