import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        scanner.close();

        if (decimal < 0) {
            System.out.println("INVALID Input");
        } else if (decimal == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("Octal representation: " + Integer.toOctalString(decimal));
        }
    }
}
