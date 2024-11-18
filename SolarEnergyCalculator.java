import java.util.Scanner;

public class SolarEnergyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of solar panels installed: ");
        int numberOfPanels = scanner.nextInt();
        
        System.out.print("Enter the number of days to calculate: ");
        int numberOfDays = scanner.nextInt();
        
        double totalEnergy = 0;
        
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.print("Enter the number of sunlight hours for day " + day + ": ");
            double sunlightHours = scanner.nextDouble();
            
            double dailyEnergy = numberOfPanels * sunlightHours * 1.5;
            totalEnergy += dailyEnergy;
        }
        
        double averageEnergy = totalEnergy / numberOfDays;
        
        System.out.println("Total energy generated: " + totalEnergy + " kWh");
        System.out.println("Average daily energy production: " + averageEnergy + " kWh");
        
        scanner.close();
    }
}
