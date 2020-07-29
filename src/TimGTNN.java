import java.util.Scanner;

public class TimGTNN {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }

        int min = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        System.out.println("Gia tri nho nhat cua mang: " + min + " tai vi tri: " + index);
    }
}
