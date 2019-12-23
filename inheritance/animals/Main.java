package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Animal>animals = new ArrayList<>();

        while(!input.equals("Beast!")){

            String[] params = scanner.nextLine().split("\\s+");

            Animal animal = null;
            try{
            if(input.equals("Dog")){
                animal = new Dog(params[0],Integer.parseInt(params[1]),params[2]);
            }else if(input.equals("Cat")){
                animal = new Cat(params[0],Integer.parseInt(params[1]),params[2]);
            }else if(input.equals("Kittens")){
                animal = new Kitten(params[0],Integer.parseInt(params[1]));
            }else if(input.equals("Tomcat")){
                animal = new Tomcat(params[0],Integer.parseInt(params[1]));
            }else if(input.equals("Frog")){
                animal = new Frog(params[0],Integer.parseInt(params[1]),params[2]);
            }

            animals.add(animal);

            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.produceSound());
        }
    }
}
