import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 5, 6, 2, 8, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa: ");
        int value = scanner.nextInt();

        System.out.println("Array before: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                for(int j = i; j < array.length - 1; j++){
                    array[j] = array[j+1];
                }
                i--;
            }
        }

        System.out.println();
        System.out.println("Array after: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }

}
