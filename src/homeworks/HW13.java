package homeworks;

import java.time.Year;
import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Please enter a year");

        int year = scanner.nextInt();
        determineLeapYear(year);
        determineLeapYearString(year);

      }

      public static void    determineLeapYear (int year) {
          if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
              System.out.println(" Its a leap year");
          } else {
              System.out.println(" Its not a leap year");
          }
      }
    public static  String determineLeapYearString (int year) {
        String answer;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return "leap year";
        } else {
            return "not a leap year";
        }
    }
}