package Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Please enter a year");

        int input = scanner.nextInt();

        if (input > 0) {
            if (input <= 2100) {
                if (input % 4 == 0 && input % 100 != 0 || input % 400 == 0) {
                    System.out.println(" Its a leap year");
                } else {
                    System.out.println(" Its not a leap year");
                }
            } else {
                System.out.println(" You are looking to far in the future, live for today");
            }
        }else{
            System.out.println(" Invalid input");

        }

    }
}
