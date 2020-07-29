import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        initialArray(array1);
        initialArray(array2);

        int[] array3 = new int[array1.length + array2.length];
        for(int i = 0; i < array3.length; i++){
            if(i < array1.length){
                array3[i] = array1[i];
            }else{
                array3[i] = array2[i - array1.length];
            }
        }

        System.out.println("array1: ");
        displayArray(array1);
        System.out.println("\narray2: ");
        displayArray(array2);
        System.out.println("\narray3: ");
        displayArray(array3);
    }

    public static void initialArray(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter value of element at position " + i + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
