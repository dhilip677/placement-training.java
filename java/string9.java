import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine().trim();

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }

    public static boolean isBalanced(String expr) {
        int count = 0;
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
                if (count < 0) { // more closing brackets than opening
                    return false;
                }
            }
        }
        return count == 0;
    }
}
