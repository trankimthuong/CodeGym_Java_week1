package QuardraticEquation;

public class QuardraticEquation {
    private double a, b, c;
    public QuardraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscrimanant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1(){
        if(getDiscrimanant() < 0)
            return 0;
        return (-this.b + Math.sqrt(getDiscrimanant()))/(2 * this.a);
    }

    public double getRoot2(){
        if(getDiscrimanant() < 0)
            return 0;
        return (-this.b - Math.sqrt(getDiscrimanant()))/(2 * this.a);
    }
}
