import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();
        if (decimalNum < 0) {
            decimalNum = Math.abs(decimalNum);
        }
        if (decimalNum == 0) {
            System.out.println("Given Input is InValid.");
        } else {
            System.out.println(Integer.toHexString(decimalNum).toUpperCase());
        }
    }
}
