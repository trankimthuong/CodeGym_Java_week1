import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        final double rate = 23000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of money (USD): ");
        double USD = scanner.nextDouble();
        System.out.printf("%f usd = %f vnd", USD, USD * rate);
    }
}
