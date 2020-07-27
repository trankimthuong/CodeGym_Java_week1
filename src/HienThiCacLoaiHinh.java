import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int choice;
        do{
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    System.out.println("Botton-left");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-left");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 5; j >= i; j--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-right");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j < i; j++){
                            System.out.print("  ");
                        }
                        for(int k = 5 - i + 1; k >= 1; k--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Bottom-right");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 5 - i + 1; j++){
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= i ; k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 5 - i; j >= 0; j--){
                            System.out.print("  ");
                        }
                        for(int k = 1; k <= (i * 2 - 1); k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!!!");
            }
        }while(choice != 4);
    }
}
