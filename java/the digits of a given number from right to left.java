4.Write a C program to display the digits of a given number from right to left

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Input must be >= 1
        scanner.close();

        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            System.out.print(digit + " ");
            number /= 10;             // Remove the last digit
        }
    }
}
