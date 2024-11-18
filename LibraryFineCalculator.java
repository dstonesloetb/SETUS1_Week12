import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBooks = 0;
        double totalFine = 0.0;
        boolean moreBooks = true;

        while (moreBooks) {
            System.out.print("Enter the number of days the book is overdue: ");
            int daysOverdue = scanner.nextInt();

            double fine = calculateFine(daysOverdue);
            totalFine += fine;
            totalBooks++;

            System.out.printf("Fine for this book: $%.2f\n", fine);

            System.out.print("Are there more books to process? (yes/no): ");
            String response = scanner.next().toLowerCase();
            moreBooks = response.equals("yes");
        }

        System.out.println("\nProcessing complete.");
        System.out.println("Total books processed: " + totalBooks);
        System.out.printf("Total fine amount: $%.2f\n", totalFine);

        scanner.close();
    }

    public static double calculateFine(int days) {
        if (days <= 7) {
            return days * 0.50;
        } else if (days <= 14) {
            return 7 * 0.50 + (days - 7) * 1.00;
        } else {
            return 7 * 0.50 + 7 * 1.00 + (days - 14) * 2.00;
        }
    }
}
