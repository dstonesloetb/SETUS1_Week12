import java.util.Scanner;

public class WeatherStationV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of synoptic stations: ");
        int numStations = input.nextInt();

        input.nextLine(); // Consume the newline character

        int maxTemperature = Integer.MIN_VALUE;
        String stationWithMaxTemp = "";
        String aboveThresholdStations = "";

        System.out.print("Enter the temperature threshold value: ");
        int threshold = input.nextInt();
        input.nextLine(); // Consume the newline character

        for (int i = 1; i <= numStations; i++) {
            System.out.print("Enter the name of station [" + i + "]: ");
            String stationName = input.nextLine();

            System.out.print("Enter temperature recorded for [" + stationName + "]: ");
            int temperature = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (temperature > maxTemperature) {
                maxTemperature = temperature;
                stationWithMaxTemp = stationName;
            }

            if (temperature > threshold) {
                if (!aboveThresholdStations.isEmpty()) {
                    aboveThresholdStations += ", ";
                }
                aboveThresholdStations += "[" + stationName + "]";
            }
        }

        System.out.println("[" + stationWithMaxTemp + "] had the highest reported temperature with [" + maxTemperature + "] degrees");
        System.out.println(aboveThresholdStations + " reported temperature(s) above [" + threshold + "] degrees");

        input.close();
    }
}
