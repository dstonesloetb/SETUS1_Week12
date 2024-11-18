import java.util.Scanner;

public class LibraryLateFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of books borrowed: ");
        int numberOfBooks = scanner.nextInt();
        
        double totalLateFee = 0;
        int lostBooks = 0;
        
        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.print("Enter the number of days book " + i + " is overdue: ");
            int daysOverdue = scanner.nextInt();
            
            double lateFee;
            if (daysOverdue <= 30) {
                lateFee = daysOverdue * 0.50;
                System.out.printf("Late fee for book %d: $%.2f\n", i, lateFee);
            } else {
                lateFee = 30 * 0.50; // Maximum late fee
                System.out.printf("Book %d is considered lost. Late fee: $%.2f\n", i, lateFee);
                lostBooks++;
            }
            
            totalLateFee += lateFee;
        }
        
        System.out.printf("\nTotal late fee for all books: $%.2f\n", totalLateFee);
        System.out.println("Number of books considered lost: " + lostBooks);
        
        scanner.close();
    }
}
