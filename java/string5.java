import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept the full sentence (including spaces)
        String input = sc.nextLine();

        // Split into words
        String[] words = input.split("\\s+");

        // Reverse the words
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) System.out.print(" "); // Add space except after last word
        }
    }
}
