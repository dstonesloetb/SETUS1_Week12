import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu items and prices
        String[] menuItems = {"Burger", "Pizza", "Salad", "Pasta", "Soda"};
        double[] prices = {8.99, 12.99, 7.99, 10.99, 2.99};
        
        System.out.println("Welcome to the Restaurant Order System");
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, menuItems[i], prices[i]);
        }
        
        double totalCost = 0;
        int itemCount = 0;
        int choice;
        
        do {
            System.out.print("Enter the item number (1-5) or 0 to finish the order: ");
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 5) {
                totalCost += prices[choice - 1];
                itemCount++;
                System.out.printf("Added %s. Current total: $%.2f%n", menuItems[choice - 1], totalCost);
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        
        System.out.printf("%nOrder complete!%n");
        System.out.printf("Number of items ordered: %d%n", itemCount);
        System.out.printf("Final total: $%.2f%n", totalCost);
        
        scanner.close();
    }
}
