import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    // Function to convert Celsius to Fahrenheit
    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
