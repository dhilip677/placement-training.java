import java.util.Scanner;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine().trim();  // Read input

        if (isValidIP(ip)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        
        // Must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            // Check if numeric only
            if (!part.matches("[0-9]+")) {
                return false;
            }
            try {
                int num = Integer.parseInt(part);
                // Must be in range 0–255
                if (num < 0 || num > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
