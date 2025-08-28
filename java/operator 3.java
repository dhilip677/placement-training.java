import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double quotient = (double) a / b;
        int remainder = a % b;
        System.out.printf("%d / %d = %.6f\n", a, b, quotient);
        System.out.printf("%d %% %d = %d\n", a, b, remainder);
        
        sc.close();
    }
}
