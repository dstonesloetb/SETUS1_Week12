import java.util.Scanner;

public class VendingMachineSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Vending Machine!");
            System.out.println("Available snacks:");
            System.out.println("1. Chips - $1.50");
            System.out.println("2. Chocolate - $2.00");
            System.out.println("3. Soda - $1.25");
            System.out.println("Enter your choice (1-3) or 0 to exit:");

            int choice = scanner.nextInt();
            double price = 0;

            switch (choice) {
                case 1:
                    price = 1.50;
                    break;
                case 2:
                    price = 2.00;
                    break;
                case 3:
                    price = 1.25;
                    break;
                case 0:
                    running = false;
                    continue;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            double insertedAmount = 0;
            while (insertedAmount < price) {
                System.out.printf("Insert coins (current amount: $%.2f). Accepts $0.25, $0.50, $1.00:\n", insertedAmount);
                double coin = scanner.nextDouble();

                if (coin == 0.25 || coin == 0.50 || coin == 1.00) {
                    insertedAmount += coin;
                } else {
                    System.out.println("Invalid coin, please insert $0.25, $0.50, or $1.00.");
                }
            }

            double change = insertedAmount - price;
            System.out.printf("Dispensing your snack! Your change is: $%.2f\n", change);
        }

        System.out.println("Thank you for using the Vending Machine!");
        scanner.close();
    }
}
