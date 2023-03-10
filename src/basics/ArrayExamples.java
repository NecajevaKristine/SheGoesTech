package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //Declare array that will store 3 elements of type String
        String[]names = new String[3];

        //Setting element values using each elements index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //Getting values from array
        System.out.println(names[2]);

        //Length
        System.out.println(names.length);


        //Second way - declare and initialize array at the same time
        String[] dreamCars = new String[]{"BMW", "Tesla", "Ferrari", "Opel", "Ford"};

        //Iterate through all elements in array with for loop
        for (int i = 0; i < dreamCars.length; i++){
            System.out.println(i+1 + "." + dreamCars[i]);
            //varētu tikai System.out.println(dreamcars[i]); un tad izprinētu tikai mašīnu nosaukumus bez numerācijas
        }

        //Same thing but using for-each loop
        for (String car: dreamCars){
            System.out.println("Hello car: " + car);
        }

        //System.out.println(Arrays.toString(dreamCars));

        //Example

        int table [] = {321,32,33,47,5,666};
        for (int value: table){
            if (value % 2 == 0){
                System.out.println(value + " -even number");
            }else{
                System.out.println(value + " -odd number");
            }
        }

    }
}
