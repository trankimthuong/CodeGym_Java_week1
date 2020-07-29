import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,0,0,0,0,0};
        int index;
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can chen: ");
        value = scanner.nextInt();
        do {
            System.out.println("Nhap vao vi tri index can chen: ");
            index =scanner.nextInt();
            if(index < 0 || index >= array.length){
                System.out.println("Gia tri index khong hop le. Try again!!!");
            }
        }while (index < 0 || index >= array.length);

        System.out.println("Array before: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        for(int i = array.length - 1; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = value;

        System.out.println();
        System.out.println("Array after: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
