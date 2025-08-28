21.Find whether the given number is smooth number or not as per the given smooth.

import java.util.Scanner;

public class SmoothNumberCheck {

    // Function to find the largest prime factor of n
    public static int largestPrimeFactor(int n) {
        int largestFactor = -1;

        // Remove factors of 2
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If remaining n is > 2, it is prime
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int smooth = scanner.nextInt();
        scanner.close();

        int largestPrime = largestPrimeFactor(num);

        if (largestPrime <= smooth) {
            System.out.println("Smooth Number");
        } else {
            System.out.println("Not a Smooth Number");
        }
    }
}
