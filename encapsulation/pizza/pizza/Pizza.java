package pizza;

import utils.ValidatorUtil;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings){
        ValidatorUtil.validatePizzaName(name);
        this.name = name;
        this.setToppingsCount(numberOfToppings);
    }

    private void setToppingsCount(int numberOfToppings) {
        if(numberOfToppings>10 || numberOfToppings<0){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public String getName() {
        return this.name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        return dough.calculateCalories() +
                toppings.stream()
                .mapToDouble(t->t.calculateCalories())
                .sum();
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",this.getName(),this.getOverallCalories());
    }
}
