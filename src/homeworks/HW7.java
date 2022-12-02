package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Please enter size of an array");
        int arrayNumber = scanner.nextInt();

        int[] array = new int[arrayNumber];
        System.out.println("Please enter elements of array one by one:");

        for (int i= 0; i<array.length; i++){
            System.out.println("Please enter number:"  + (i+1));
            array[i] = scanner.nextInt();

        }

        System.out.println("Source array:" + Arrays.toString(array));



    }
}
