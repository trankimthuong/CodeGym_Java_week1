package colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(2.0, 3);
        shapes[2] = new Square(4);

        for(Shape shape: shapes){
            double area;
            if(shape instanceof Circle){
                shape = (Circle) shape;
                area = ((Circle) shape).getArea();
            }else if(shape instanceof Rectangle){
                shape = (Rectangle) shape;
                area = ((Rectangle) shape).getArea();
            }else if(shape instanceof Square){
                shape = (Square) shape;
                area = ((Square) shape).getArea();
                ((Square) shape).howToColor();
            }else{
                area = 0;
            }
            System.out.println("Area = " + area);
        }
    }
}
