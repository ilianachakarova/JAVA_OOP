package Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car",readVehicleInput(scanner.nextLine()));
        vehicles.put("Truck",readVehicleInput(scanner.nextLine()));
        vehicles.put("Bus",readVehicleInput(scanner.nextLine()));

        int n = Integer.parseInt(scanner.nextLine());

        while(n-->0){
            String [] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String type = tokens[1];
            double value = Double.parseDouble(tokens[2]);
            try {
                if (command.equals("Drive") && !type.equals("Bus")) {
                    vehicles.get(type).drive(value);
                } else if (command.equals("Drive")) {
                    ((Bus) vehicles.get(type)).setOccupied(true);
                    vehicles.get(type).drive(value);
                } else {
                    vehicles.get(type).refuel(value);
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
            vehicles.values().forEach(System.out::println);


    }

    private static Vehicle readVehicleInput(String nextLine) {
        String [] tokens = nextLine.split("\\s+");
        double quantity = Double.parseDouble(tokens[1]);
        double consumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);
        Vehicle vehicle = null;
        switch (tokens[0]){

            case "Car":
                vehicle = new Car(quantity,consumption,tankCapacity);
                break;
            case "Truck":
               vehicle = new Truck(quantity,consumption,tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(quantity,consumption,tankCapacity);
                break;
        }

        return vehicle;
    }
}
