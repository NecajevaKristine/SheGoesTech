package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*      Write an application, that will read one number from user (of type int)
              and check, if given number is "near" 100. A number is "near" 100 when
              difference between it and 100 is no bigger than 10.

               Your application should read one number (int) and print false or true on the screen,
                according to instructions above.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade1");
        int grade1 =scanner.nextInt();

        System.out.println("Enter a grade2");
        int grade2 = scanner.nextInt();

        if ((grade1 >= 90 && grade1 <= 110) && (grade2 >= 90 && grade2 <= 110)) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }

        System.out.println("Max " + Math.max(grade1,grade2));



    }
}
