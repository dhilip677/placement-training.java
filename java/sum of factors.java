Find the sum of factors of the given number.

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        // Loop from 1 to n to find all factors and add them
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}