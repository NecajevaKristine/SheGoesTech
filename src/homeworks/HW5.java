package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        /*Alex is an owner of grocery store. Among many products he sells,
he's mostly famous for his hand-made jam, that is being
sold in jars of 1kg or 7kg. Alex sells only full jars
(i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

Will is asked by his wife Jane to buy some amount of Alex's jam.
Will forgot to take his bag, thus he can take home no more than six jars of jam
(three jars in each of his two hands). Jane is very serious about the
shopping list - if she asked for specific amount of jam, she expects exactly this
amount, no more, no less.

Write an application that will check if Will is able to take home the
amount of jam specified by Jane. Amount of jam should be read from user
(positive int value). You can assume that there's always enough jam in Alex's shop.
Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount (kg) of jam You want to buy ");

        int amountOfJam = scanner.nextInt();
        int amountOf7KgJars = amountOfJam/7;
        System.out.println("amountOf7KgJars=" + amountOf7KgJars);

        // Lets calculate how many big jars we need - prefer big jars
        //Division/of integer values
        //for example
        //10/7=1
        //5/7=0
        //21/7=3

        int amountOf1KgJar = amountOfJam % 7;
        System.out.println("amountOf1kgJar=" + amountOf1KgJar);


        System.out.println(amountOf7KgJars + amountOf1KgJar <=6 );














    }
}
