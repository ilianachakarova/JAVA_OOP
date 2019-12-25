package shoppingspree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
       this.setName(name);
        this.setCost(cost);
    }

    private void setCost(double cost) {
        this.cost = cost;
        if(this.cost<=0){
            throw new IllegalArgumentException("Cost cannot be a negative number!");
        }

    }

    private void setName(String name) {
        this.name = name;
        if(this.name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be an empty string!");
        }

    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
