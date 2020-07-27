import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can in: ");
        value = scanner.nextInt();
        int count = 0;
        for(int i = 2;; i++){
            boolean check = true;
            for(int k = 2; k <= Math.sqrt(i); k++){
                if(i % k == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
                System.out.printf("\nso thu %d: %d", count, i);
            }
            if(count == value){
                break;
            }
        }
    }
}
