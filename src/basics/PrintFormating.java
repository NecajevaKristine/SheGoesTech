package basics;

public class PrintFormating {
    public static void main(String[] args) {

        //s-String
        //d-integers
        //f-float/double
        //c-char
        //b-boolean

        String name = "Bob";
        int age = 34;
        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age is %d\n", name,age);

        double height = 129.235454455d;
        System.out.printf("%s is %.2f cm tall", name, height);



    }
}
