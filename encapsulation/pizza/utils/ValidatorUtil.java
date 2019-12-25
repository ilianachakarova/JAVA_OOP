package utils;

public class ValidatorUtil {

    public static void validateToppingWeight(String topping, double weight){
        if(weight<1 || weight>50){
            throw new IllegalArgumentException
                    (String.format("{Topping type name} weight should be in the range [1..50]."));
        }
    }

    public static void validateDoughWeight(double weight){
        if(weight<1 || weight>200){
            throw new IllegalArgumentException
                    (("Dough range should be between [1-200]"));
        }
    }

    public static void validatePizzaName(String name){
        if(name.trim().isEmpty() || name.length()>15){
            throw new IllegalArgumentException(("Pizza name should be between 1 and 15 symbols."));
        }
    }
}
