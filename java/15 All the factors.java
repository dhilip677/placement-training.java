15.Print all the factors of the given number.

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                if (i != number) {
                    System.out.print(",");
                }
            }
        }
    }
}
