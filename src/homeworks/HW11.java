package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         boolean i = true;

         while(i) {

             System.out.println("Please enter your personal number");
             String personalNumber = scanner.nextLine();

             Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
             Matcher matcher = pattern.matcher(personalNumber);

             boolean validPersonalNumber = matcher.matches();

             if (validPersonalNumber != true) {
                 System.out.println("Your inputted personal number is not valid");
             } else {
                 System.out.println("Your inputted personal number is valid");

                     System.out.println("Do You want to check your personal number again? Please answer yes or no by y or n");
                     String answerInput = scanner.nextLine();

                     Pattern pattern1 = Pattern.compile("n");
                     Matcher matcher1 = pattern1.matcher(answerInput);

                     i = matcher1.matches();

                     Pattern pattern2 = Pattern.compile("y");
                     Matcher matcher2 = pattern2.matcher(answerInput);

                     i = matcher2.matches();

                     if(i!=true){
                         System.out.println("Process finished");
                     }else{
                         System.out.println("Enter personal number");
                     }
             }
         }

    }
}
