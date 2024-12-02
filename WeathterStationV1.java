/* Purpose:   WeatherStation Demo For Loop
 * Author: D Stones
 * Date: 
 */

import java.util.Scanner;

public class WeathterStationV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of synoptic stations: ");
        int numStations = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        String highestStation = "";
        int highestTemperature = Integer.MIN_VALUE;

        for (int i = 1; i <= numStations; i++) {
            System.out.print("Enter the name of station [" + i + "]: ");
            String stationName = scanner.nextLine();

            System.out.print("Enter temperature recorded for [" + stationName + "]: ");
            int temperature = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (temperature > highestTemperature) {
                highestTemperature = temperature;
                highestStation = stationName;
            }
        }

        System.out.println(highestStation + " had the highest reported temperature with " + highestTemperature + " degrees");
    } //end main
} //end class
