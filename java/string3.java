import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the entire line (may contain spaces)
        String input = sc.nextLine();

        if (isPangram(input)) {
            System.out.println("Pangrams");
        } else {
            System.out.println("Not Pangrams");
        }
    }

    private static boolean isPangram(String s) {
        if (s == null) return false;

        boolean[] seen = new boolean[26]; // tracks a..z
        int distinct = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                int idx = c - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    distinct++;
                    if (distinct == 26) {
                        return true; // early exit once all letters are found
                    }
                }
            }
        }
        return false;
    }
}
