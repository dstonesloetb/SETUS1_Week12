import java.util.Scanner;

public class PasswordChangeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid;

        do {
            System.out.println("Enter a new password:");
            password = scanner.nextLine();
            isValid = validatePassword(password);

            if (!isValid) {
                System.out.println("Password does not meet the criteria. Please try again.");
            }
        } while (!isValid);

        System.out.println("Password changed successfully!");
        scanner.close();
    }

    public static boolean validatePassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("@#$%^&+=".indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}
