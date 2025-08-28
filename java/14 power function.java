14.Implement the power function using looping statement

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        scanner.close();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}
