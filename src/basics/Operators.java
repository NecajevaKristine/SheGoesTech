package basics;public class Operators {
    public static void main(String[] args) {

        //AssignmentOperators =,+=, -=, *=, /=
        int a = 100;
        System.out.println("a = " + a);
        a += 10;
        System.out.println("a = " + a);

        //BasicArithmeticOperators -,+,/,*,%
        int x = 100;
        x = 45+10;
        System.out.println("x = " + x);

        System.out.println(x + 15);

        //IncrementationAndDecremantationOperators
        //Post-incrementation
        int num1 = 10;
        num1++;
        System.out.println("num1="+num1);
        System.out.println("num1="+num1++);
        System.out.println("num1="+num1);

        //Pre-incrementation
        System.out.println("num1="+--num1);

        //4 ways to increase or decrease variable by one
        num1+=1;
        num1=num1+1;
        num1++;
        ++num1;

        //RelationalOperators
        //Equality ==
        int i = 1;
        int b = 10;
        System.out.println("Equality" + (i==b));

        //Inequality
        System.out.println("Inequality"+ (i!=b));

        //Greater than> and greater than or equal to
        System.out.println("Greater than" + (i>b));
        System.out.println("Ģreater than or equal to" + (i>=b));

        //Less than< and less than or equal to
        System.out.println("Less than"+ (i<b));
        System.out.println("Less than or equal to" + (i<=b));

        //Logical operators
        //Logical and = &&

        boolean sun = true;
        boolean dry = true;
        System.out.println("I will go outside" + (sun && dry));

        //Logical OR - ||
        boolean sale = false;
        boolean rich = true;

        System.out.println("I will by iPhone" + (sale||rich));








    }


}
