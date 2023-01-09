package homeworks.HW15;

import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an amount of liters ");
        float fuel = scanner.nextFloat();

        System.out.println("Please enter fuel usage ");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Please enter number of passengers ");
        int passengers = scanner.nextInt();


        Vehicles vehicle = new Vehicles(fuel, fuelUsage, passengers);
        float maxDistance = vehicle.maxDistance();
        System.out.println("You can drive " + maxDistance + "km");


    }
}
