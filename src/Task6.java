import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = InputHelper.getDouble(scanner, "Input the temperature (Celsius): ");
        double fahrenheit = InputHelper.celsiusToFahrenheit(celsius);

        System.out.printf("%-1s%10.2f", "The temperature in fahrenheit: ", fahrenheit);
    }
}
