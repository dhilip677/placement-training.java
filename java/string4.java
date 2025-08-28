import java.util.*;

public class IsogramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept the string
        String str = sc.nextLine();

        // Check and print result
        if (isIsogram(str)) {
            System.out.println("ISOGRAM");
        } else {
            System.out.println("NOT ISOGRAM");
        }
    }

    private static boolean isIsogram(String s) {
        s = s.toLowerCase(); // case-insensitive
        boolean[] seen = new boolean[26]; 
        // to track letters

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') { 
                // consider only letters
                int idx = c - 'a';
                if (seen[idx]) {
                    return false; // letter repeated
                }
                seen[idx] = true;
            }
        }
        return true; // no repetitions found
    }
}
