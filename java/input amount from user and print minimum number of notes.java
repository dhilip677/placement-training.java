Write a C program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] n1 = {500, 100, 50, 20, 10, 5, 2, 1};
        int[] c1 = new int[8];
        int remaining = amount;
        for (int i = 0; i < 8; i++) {
            c1[i] = remaining / n1[i];  
            remaining = remaining % n1[i]; 
        }
        System.out.println("Total number of notes:");
        for (int i = 0; i < 8; i++) {
            System.out.println(n1[i] + " : " + c1[i]);
        }

        scanner.close();
    }
}