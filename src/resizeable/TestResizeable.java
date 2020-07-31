package resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.toString());
        circle.resize(150);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println(rectangle);
        rectangle.resize(200);
        System.out.println(rectangle);

        Square square = new Square(5);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);
    }
}
