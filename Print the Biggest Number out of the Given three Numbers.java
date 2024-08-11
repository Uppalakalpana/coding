import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int biggest = num1;
        if (num2 > biggest) {
            biggest = num2;
        }
        if (num3 > biggest) {
            biggest = num3;
        }

        System.out.println(biggest + " is a Biggest Number from the Given Numbers.");
    }
}
