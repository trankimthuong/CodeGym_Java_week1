package triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(1,2,3);
        System.out.println(triangle);
        triangle = new Triangle(-1, -1, -1.5);
        System.out.println(triangle);
        triangle = new Triangle(3,4,5);
        System.out.println(triangle);
    }
}
