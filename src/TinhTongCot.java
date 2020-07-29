import java.util.Scanner;

public class TinhTongCot {
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

        int index_col, total = 0;
        do {
            System.out.println("Nhap vao cot ban muon tinh tong: ");
            index_col = scanner.nextInt();
            if(index_col < 0 || index_col >= arr[0].length){
                System.out.println("Error. Try again!!!");
            }
        }while (index_col < 0 || index_col >= arr[0].length);
        for(int i = 0; i < arr.length; i++){
            total += arr[i][index_col];
        }
        System.out.printf("Tong cot %d: %d", index_col, total);
    }
}
