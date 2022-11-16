import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        // Using scanner ask user to enter name and year of birth
        // Print out:
        // Input: John, 2000
        // "Your name is John and you are 22 years old"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter yor age");
        int age = scanner.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old");

    }
}
