package homeworks.HW15;

import java.util.Scanner;

public class CallingCar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter fuel");
        float fuel = scanner.nextFloat();

        System.out.println("Enter fuel usage");
        float fuelUsage=scanner.nextFloat();

        System.out.println("Enter passengers");
        int passengers=scanner.nextInt();

        System.out.println("Will you turn on air conditioner?y/n");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditioner=false;

        if(input=='y'){
            airConditioner=true;
        }
        Car car= new Car(fuel, fuelUsage, passengers,airConditioner);
        System.out.printf("Your vehicle can drive maximum of %.2fkm", car.maxDistance());
        System.out.println();
        System.out.println(car.maxDistance(100,10,5));
    }
}
