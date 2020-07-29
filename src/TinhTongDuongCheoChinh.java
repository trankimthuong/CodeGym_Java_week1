import java.util.Scanner;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        int size;
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        arr = new int[size][size];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.printf("\nEnter arr[%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i][i];
        }

        System.out.println("Tong duong cheo chinh la: " + total);
    }
}
