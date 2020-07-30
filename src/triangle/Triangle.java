package triangle;

public class Triangle extends Shape{
    private double side1 = 1.0f;
    private double side2 = 1.0f;
    private double side3 = 1.0f;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    private boolean isTriangle(){
        if((getSide1() + getSide2()) <= getSide3()
        || (getSide2() + getSide3()) <= getSide1()
        || (getSide1() + getSide3()) <= getSide2())
            return false;
        if(getSide1() <= 0 || getSide2() <= 0 || getSide3() <= 0)
            return false;
        return true;
    }

    private double getPerimeter(){
        return getSide1() + getSide2() + getSide3();
    }

    private double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
    }

    @Override
    public String toString() {
       if(isTriangle()){
           return "A triangle with (side1,side2,side3)=(" + getSide1() + ","
                   + getSide2() + "," + getSide3() + ") area = " + getArea()
                   +" perimeter = "  + getPerimeter() + super.toString();
       }else
           return "A triangle with (side1,side2,side3)=(" + getSide1() + ","
                + getSide2() + "," + getSide3() + ") this is not triangle" + super.toString();
    }
}
