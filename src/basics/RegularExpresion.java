package basics;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {
    public static void main(String[] args) {

        //1 example
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aab"); // matcher tiek salīdzināts ar pattern - ja atbilst, tad liek true

        System.out.println(matcher.matches());
        //System.out.println(matcher.find());// pārbauda, vai visā STRING ir tāds, kas sakrīt ar pattern

        //2 example
        //Any 3 lowercase letters or any number between 5-9

        System.out.println(Pattern.matches("[a-z5-9]{3}", "ax8"));

        //2 Uppercase letters, 2 lowercase letters, 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2}[0-9]{3}", "GDFjhg255"));

        //7 letters or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "Fjhg655"));

        //Examples: NF-3422
        //          GF-234
        //          GW-01

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your cars plate number");
        String plateNumber = scanner.nextLine();

        //2 uppercase letters followed by one "-" and then (2-4) numbers
        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{2,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);

        boolean validPlateNumber = matcher1.matches();

        if(validPlateNumber == true){
            System.out.println("Your plate number is valid");
        }else{
            System.out.println("Your plate number is not valid");
        }


    }
}
