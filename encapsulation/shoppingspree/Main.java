package shoppingspree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = Arrays.stream(scanner.nextLine().split(";"))
                .map(p->{
                    String [] data = p.split("=");
                    return new Person(data[0], Double.parseDouble(data[1]));
                }).collect(Collectors.toList());

        List<Product> products  = Arrays.stream(scanner.nextLine().split(";"))
                .map(p->{
                    String [] data = p.split("=");
                    return new Product(data[0], Double.parseDouble(data[1]));
                }).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String [] data = input.split("\\s+");

            for (Person person : people) {

                if(person.getName().equals(data[0])){
                    Product product = null;

                    for (Product p : products) {
                        if(p.getName().equals(data[1])){
                            product = p;
                            break;
                        }
                    }
                    if (product != null) {
                        try{
                            person.buyProduct(product);
                            System.out.println(String.format("%s bought %s",person.getName(),product.getName()));
                        }catch (IllegalStateException ex){
                            System.out.println(ex.getMessage());
                        }
                    }

                    break;
                }
            }
            input = scanner.nextLine();
        }

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
