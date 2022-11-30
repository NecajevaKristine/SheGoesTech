package basics;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //Declaring 20 array with 2 rows and 5 columns
        String [][] dreamCars = new String[2][5];
        dreamCars [0][0] = "Audi";
        dreamCars [0][1] = "BMW";
        dreamCars [0][2] = "Opel";
        dreamCars [0][3] = "Volvo";
        dreamCars [0][4] = "Lamborghini";

        dreamCars [1][0] = "Lada";
        dreamCars [1][1] = "Ferrar";
        dreamCars [1][2] = "Subaru";
        dreamCars [1][3] = "Saab";
        dreamCars [1][4] = "McLaren";

        //How many rows are in array
        System.out.println(dreamCars.length);

        //How many columns are in one row
        System.out.println(dreamCars[0].length);

        //i- row
        //j - column

        for (int i = 0; i < dreamCars.length; i++ ){
            for (int j = 0; j<dreamCars[i].length; j++){
                System.out.print (dreamCars [i] [j] );
            }
            System.out.println();
        }

        //Same thing using nested for - each loops

        for (String [] group: dreamCars ){

            //System.out.println(Arrays.toString(group));

            for(String car: group){
                System.out.print (car + " ");
            }
            System.out.println();
        }




    }
}
