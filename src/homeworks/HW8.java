package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter array size: ");
        int arraySize = scanner.nextInt();

        int storagArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one");

        for (int i = 0; i<storagArray.length; i++){
            System.out.println("Please eneter element number: " + (i+1));
            storagArray[i] = scanner.nextInt();
            sum +=storagArray[i];

        }
        System.out.println("Average grade: " + (sum/storagArray.length));
        System.out.println("There was " + storagArray.length + "grades");
        System.out.println(Arrays.toString(storagArray));

    }
}
