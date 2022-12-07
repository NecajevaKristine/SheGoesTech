package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println( "Please enter number for tree size");
        int treeSize = scanner.nextInt();

        //levels
            for (int i = 0; i<treeSize; i++) {

                //spaces
                for (int j = 0; j < treeSize - 1-i; j++) {
                    System.out.print(" ");
                }
                //stars
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }

            for(int i = 0; i<treeSize-1; i++) {
                System.out.print(" ");
            }

            System.out.println("#");


        }
}
