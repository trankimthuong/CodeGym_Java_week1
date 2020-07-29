package Fan;

public class test {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan1 = new Fan(FAST, true, 10, "yellow");
        Fan fan2 = new Fan(MEDIUM, false, 5, "blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
