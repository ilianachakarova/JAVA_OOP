package shoppingspree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
         this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product){
        if(this.money>=product.getCost()){
            this.money -= product.getCost();
            this.products.add(product);
        }else{
            throw new IllegalStateException(String.format("%s can't afford %s",this.name,product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        String output = "Nothing bought";

        if(!this.products.isEmpty()){
            output = this.products.stream()
                    .map(p->p.getName())
                    .collect(Collectors.joining(", "));
        }

        return this.name + " - " + output;
    }

    private void setName(String name) {
        this.name = name;
        if(this.name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty string");
        }
    }
    private void setMoney(double money){
        this.money = money;
        if(this.money<=0){
            throw new IllegalArgumentException("Money cannot be a negative number!");
        }
    }
}


