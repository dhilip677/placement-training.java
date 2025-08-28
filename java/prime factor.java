12.Find all the prime factors of the given number.

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 2; i <= n; i++) {
            int count = 0;  // reset count for each i
            
            while (n % i == 0) {
                count++;
                n /= i;
            }
            
            if (count > 0) {
                System.out.println(i + "->" + count + " ");
            }
        }

        scanner.close();
    }
}