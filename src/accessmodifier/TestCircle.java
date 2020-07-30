package accessmodifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);
        circle1.display();
        circle2.display();
    }
}
