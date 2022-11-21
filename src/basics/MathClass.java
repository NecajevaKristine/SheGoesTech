package basics;

import java.util.AbstractSequentialList;

public class MathClass {
    public static void main(String[] args) {

        float num = 5.1f;
        System.out.println(num);

        //rounding down
        System.out.println("Floor " + Math.floor(num));

        //rounding up
        System.out.println("Ceil " + Math.ceil(num));

        //according to math rule
        System.out.println("Round " + Math.round(num));

        // ABS
        System.out.println("ABS "+ Math.abs(num));

        //power
        System.out.println("Power "+ (int) Math.pow(2,3));

        //max
        System.out.println("Max " + Math.max(100,150));

        //min
        System.out.println("Min "+ Math.min(100,150));

        //max out of 3number
        System.out.println("Max out of 3 " + Math.max (Math.max(1,2),3));

        //SQRT
        System.out.println("SQRT " + Math.sqrt(64));

        //Random
        System.out.println("Random " + Math.random());
        System.out.println("Random (0-9)" + Math.random() * 10);
        System.out.println("Random (0-10)" + (int)(Math.random()*11));
        System.out.println("Random (1-10)" + ((int)(Math.random() * 10) + 1));


    }
}
