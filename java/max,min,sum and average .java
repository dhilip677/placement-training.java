16.Find the max,min,sum and average of the given n numbers without using array.

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            count++;
        }

        scanner.close();

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            float average = (float) sum / count;

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", average);
        }
    }
}
