import java.io.IOException;
import java.util.Scanner;

public class CountCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hehe until you!";
        int count = 0;
        char input_char = 'a';
        boolean check = true;
        System.out.println("Enter a char: ");
        try {
            input_char = (char)System.in.read();
        } catch (IOException e) {
            check = false;
            e.printStackTrace();
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == input_char)
                count++;
        }

        if(check){
            System.out.printf("Ky tu '%c' xuat hien %d lan!!!", input_char,count );
        }else
            System.out.println("Ky tu nhap vao khong hop le, xin kiem tra lai!!!");
    }
}
