import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean controlChar;
        do{
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            int soChuSo = (int)Math.log10(number) + 1;
            if(soChuSo == 1)
                System.out.println(docSo1ChuSo(number));
            else if(soChuSo == 2)
                System.out.println(docSo2ChuSo(number));
            else if(soChuSo == 3)
                System.out.println(docSo3ChuSo(number));
            else
                System.out.println("out of ability");
            System.out.println("do you want continue??");
            controlChar = scanner.nextBoolean();
        }while (controlChar == true);
    }

    public static String docSo1ChuSo(int number){
        String name = "";
        switch (number){
            case 1: name = "one";
                break;
            case 2: name = "two";
                break;
            case 3: name = "three";
                break;
            case 4: name = "four";
                break;
            case 5: name = "five";
                break;
            case 6: name = "six";
                break;
            case 7: name = "seven";
                break;
            case 8: name = "eight";
                break;
            case 9: name = "nine";
                break;
        }
        return name;
    }

    public static String docSo2ChuSo(int number){
        int sothunhat = number / 10;
        int sothuhai = number % 10;
        String name = "!";
        switch (number){
            case 10: name = "ten"; break;
            case 11: name = "eleven"; break;
            case 12: name = "twelve"; break;
            case 13: name = "thirdteen"; break;
            case 14: name = "fourteen"; break;
            case 15: name = "fifteen"; break;
            case 16: name = "sixteen"; break;
            case 17: name = "seventeen"; break;
            case 18: name = "eighteen"; break;
            case 19: name = "nineteen"; break;
            default:
                if(sothunhat == 2)
                    name = "twenty" + docSo1ChuSo(sothuhai);
                else if(sothunhat == 3){
                    name = "thirdty" + docSo1ChuSo(sothuhai);
                }
                else
                    name = docSo1ChuSo(sothunhat) + "ty " + docSo1ChuSo(sothuhai);
        }
        return name;
    }

    public static String docSo3ChuSo(int number){
        int soHangTram = number / 100;
        return docSo1ChuSo(soHangTram) + " hundred " + docSo2ChuSo(number % 100);
    }
}
