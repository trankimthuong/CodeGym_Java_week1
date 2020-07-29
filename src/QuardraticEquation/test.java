package QuardraticEquation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        QuardraticEquation quardraticEquation = new QuardraticEquation(a,b,c);
        double delta = quardraticEquation.getDiscrimanant();
        if(delta > 0){
            System.out.printf("\nPhuong trinh co 2 nghiem x1 = %f, x2 = %f", quardraticEquation.getRoot1(), quardraticEquation.getRoot2());
        }else if(delta == 0){
            System.out.printf("\nPhuong trinh co nghiem duy nhat x = %f", quardraticEquation.getRoot1());
        }else
            System.out.println("The equation has no roots");
    }
}
