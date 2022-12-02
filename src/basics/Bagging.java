package basics;

public class Bagging {
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

        //i- row
        //j - column

        for (int i = 0; i < dreamCars.length; i++ ){
            for (int j = 0; j<dreamCars[i].length; j++){
                System.out.print (dreamCars [i] [j] );
            }
            System.out.println();
        }

    }
}
