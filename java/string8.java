import java.util.Scanner;

public class ValidateISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine().trim();

        if (isValidISBN(isbn)) {
            System.out.println("ISBN Number is Valid");
        } else {
            System.out.println("ISBN Number is Not Valid");
        }
    }

    public static boolean isValidISBN(String isbn) {
        // Remove hyphens
        String cleanIsbn = isbn.replace("-", "");

        // Check ISBN-10
        if (cleanIsbn.length() == 10) {
            return isValidISBN10(cleanIsbn);
        }

        // Check ISBN-13
        if (cleanIsbn.length() == 13) {
            return isValidISBN13(cleanIsbn);
        }

        // Invalid length
        return false;
    }

    // Validate ISBN-10
    public static boolean isValidISBN10(String isbn) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            char ch = isbn.charAt(i);

            int value;
            if (i == 9 && ch == 'X') {
                value = 10;
            } else if (Character.isDigit(ch)) {
                value = ch - '0';
            } else {
                return false; // invalid character
            }

            sum += value * (10 - i);
        }
        return (sum % 11 == 0);
    }

    // Validate ISBN-13
    public static boolean isValidISBN13(String isbn) {
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            char ch = isbn.charAt(i);
            if (!Character.isDigit(ch)) {
                return false; // ISBN-13 must be digits only
            }
            int digit = ch - '0';
            sum += (i % 2 == 0) ? digit : digit * 3;
        }
        return (sum % 10 == 0);
    }
}
