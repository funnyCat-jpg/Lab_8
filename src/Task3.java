import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variables
        int year;
        int month;
        int day = 0;
        int hour;
        int min;

        year = InputHelper.getRangeInt(scanner, "Enter your year of birth [1950-2010]", 1950, 2010);
        scanner.nextLine(); //Clears Scanner
        month = InputHelper.getRangeInt(scanner, "Enter your month of birth [1-12]", 1, 12);
        scanner.nextLine(); //Clears Scanner
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = InputHelper.getRangeInt(scanner, "Enter your day of birth [1-31]", 1, 31);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = InputHelper.getRangeInt(scanner, "Enter your day of birth [1-30]", 1, 30);
        } else {
            day = InputHelper.getRangeInt(scanner, "Enter your day of birth [1-29]", 1, 29);
        }
        scanner.nextLine(); //Clears Scanner
        hour = InputHelper.getRangeInt(scanner, "Enter your hour of birth [1-24]", 1, 24);
        scanner.nextLine(); //Clears Scanner
        min = InputHelper.getRangeInt(scanner, "Enter your minute of birth [1-59]", 1, 59);

        System.out.println("Year:" + year);
        System.out.println("Month:" + month);
        System.out.println("Day:" + day);
        System.out.println("Hour:" + hour);
        System.out.println("Minute:" + min);
    }
}
