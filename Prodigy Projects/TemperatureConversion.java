import java.util.Scanner;

public class TemperatureConversion {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of temperature (C, F, K):");
        char unit = scanner.next().charAt(0);

        switch (unit) {
            case 'C':
            case 'c':
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.printf("%.2f Celsius is equivalent to %.2f Fahrenheit and %.2f Kelvin.%n",
                                  temperature, fahrenheitFromCelsius, kelvinFromCelsius);
                break;

            case 'F':
            case 'f':
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f Fahrenheit is equivalent to %.2f Celsius and %.2f Kelvin.%n",
                                  temperature, celsiusFromFahrenheit, kelvinFromFahrenheit);
                break;

            case 'K':
            case 'k':
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f Kelvin is equivalent to %.2f Celsius and %.2f Fahrenheit.%n",
                                  temperature, celsiusFromKelvin, fahrenheitFromKelvin);
                break;

            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                break;
        }

        scanner.close();
    }
}
