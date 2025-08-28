5.Find whether the given number is Adam or Not


import java.util.Scanner;

public class AdamNumberCheck {
    
    // Function to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Input > 0
        scanner.close();

        int reversedNum = reverse(num);
        int squareOriginal = num * num;
        int squareReversed = reversedNum * reversedNum;
        int reverseSquareReversed = reverse(squareReversed);

        if (squareOriginal == reverseSquareReversed) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not a adam number");
        }
    }
}
