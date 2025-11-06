import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int favInt = InputHelper.getInt(scanner, "Enter your favorite int: ");
        scanner.nextLine();// Clears Scanner
        double favDouble = InputHelper.getDouble(scanner, "Enter your favorite double: ");

        System.out.println("Your favorite int is " + favInt + " and your favorite double is " + favDouble + ".");
    }
}
