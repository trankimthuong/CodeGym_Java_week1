import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        int row, column;
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        row = scanner.nextInt();
        System.out.println("Enter column: ");
        column = scanner.nextInt();
        arr = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("/nNhap vao gia tri arr[" + i +"][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Hien thi mang: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int index_X = 0, index_Y = 0;
        int max = arr[0][0];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(arr[i][j] > max){
                    index_X = i;
                    index_Y = j;
                    max = arr[i][j];
                }
            }
        }

        System.out.printf("\nPhan tu lon nhat: %d, tai vi tri: [%d][%d]", max, index_X, index_Y);
    }
}
