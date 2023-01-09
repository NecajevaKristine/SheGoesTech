package Collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //declaring ArrayList
        ArrayList<String> car= new ArrayList<String>();

        //add elements
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //print out all elements
        System.out.println(car);

        //get elements by index
        System.out.println(car.get(0));
        System.out.println(car.get(1));
        System.out.println(car.get(4));

        //add element at specific index
        car.add(2, "Toyota");
        System.out.println(car);

        //change elements values
        car.set(3,"Ford");
        System.out.println(car);

        //remove elements
        car.remove(5);
        car.remove("Mercedes");
        System.out.println(car);

        //size
        System.out.println(car.size());

        //delete all elements
        car.clear();
        System.out.println(car);



    }
}
