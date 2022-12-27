package OOP;

public class Triangle {

    //fields
    private double side1;
    private double side2;
    private double side3;


    //setter methods
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //getter methods
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }

    //private method IsValid
    private boolean isValid (double side1, double side2, double side3) {

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;

            //return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
        }
    }
    //perimeter
    private double perimeter (double side1, double side2, double side3) {
        return ((side1 + side2 + side3) / 2);
    }

    //public method areTriangle
    public double areaTriangle(){
            if(isValid(side1,side2,side3)){
                double halfPer = (side1 + side2 + side3)/2;
                double area = Math.sqrt(halfPer * (halfPer-side1)*(halfPer-side2)* (halfPer-side3));
                System.out.println("Triangle area: "+ area);
                return  area;
            }else{
                System.out.println("Triangle is not valid");
                return 0;
            }
        }



}





