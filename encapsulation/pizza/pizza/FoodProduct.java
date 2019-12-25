package pizza;


public abstract class FoodProduct {
    private double weight;

    protected FoodProduct(double weight){
        this.weight = weight;
    }

    public double calculateCalories(){
        return 2 * this.weight;
    }

    protected void setWeight(double weight){
       this.weight = weight;
    }
}
