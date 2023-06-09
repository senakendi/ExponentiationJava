
import java.util.Scanner;
public class ExponentiationMethod {
    static int exponentiation(int num1, int num2) {
        int conclusion = (int) Math.pow(num1, num2);
        return conclusion;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1. number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the 2. number: ");
        int num2 = scan.nextInt();

        int conclusion = exponentiation(num1, num2);
        System.out.println(num1 + "^" + num2 + "=" + conclusion);
    }
}
