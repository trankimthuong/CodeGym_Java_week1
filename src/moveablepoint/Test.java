package moveablepoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(2,1);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1,1,3,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
