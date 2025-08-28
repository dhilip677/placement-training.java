10.Given a number, check whether it is an abundant or deficient or perfect number N number 6 , find the factors and add it eg 6 = 1 , 2 , 3

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Deficient Number");
        }

        scanner.close();
    }
}
