package Tasks.Carpet;

import OOP.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        //create floor object
        Floor floor = new Floor(length,width);

        System.out.println("Floor m^2" + floor.getArea());

        System.out.println("Please enter carpet price per m^2");
        double carpetCost = scanner.nextDouble();

        //create carpet object
        Carpet carpet = new Carpet(carpetCost);

        //create calculator object
        //floor and carpet objects as input

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Carpet will cost:" + calculator.getTotalCost() + "Eur");
    }
}
