package circleandcylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(2.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(4.0, "gray", 6.0);
        System.out.println(cylinder);
    }
}
