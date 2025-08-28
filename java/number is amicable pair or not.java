17.Find whether the given number is amicable pair or not


import java.util.Scanner;

public class AmicablePairCheck {

    // Method to calculate sum of proper divisors of n
    public static int sumOfDivisors(int n) {
        int sum = 1;  // 1 is always a divisor (except for n=1)
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if (sum1 == num2 && sum2 == num1) {
            System.out.println("Amicable Pair");
        } else {
            System.out.println("Not a Amicable Pair");
        }
    }
}