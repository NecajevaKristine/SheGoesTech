package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {

        int [] arrays = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println( "Original array: " + Arrays.toString(arrays));

        /*int[] reverseArray = new int [arrays.length];
        for (int i=0; i < arrays.length; i++){
            reverseArray[i] = arrays [arrays.length-1-i];
         }

        System.out.println("Reverse array " + Arrays.toString(reverseArray));*/

        for(int i=0;i<arrays.length/2; i++){
            int temp = arrays[i];
            arrays[i] = arrays [arrays.length-1-i];
            arrays[arrays.length-1-i] = temp;
        }

        System.out.print("Reverse array: " + Arrays.toString(arrays));


    }
}
