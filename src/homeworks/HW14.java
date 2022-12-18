package homeworks;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] my_Array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array: " + Arrays.toString(my_Array));
        System.out.println(max(my_Array));
        System.out.println(min(my_Array));
    }

    public static int max (int [] array){

        int max = array[0];
        for(int i=1; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public  static int min (int [] array){

       int min = array[0];
       for (int i=1; i<array.length; i++){
           if (array[i]<min){
               min = array[i];
           }
       }
       return min;
    }



}
