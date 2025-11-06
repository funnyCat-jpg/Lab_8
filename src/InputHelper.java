import java.util.Scanner;

public class InputHelper {

    //METHODS//

    // Returns a String of non-zero length back to user
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        //Variables
        boolean valid = false;
        String userInput;

        System.out.println(prompt);

        do {
            userInput = scan.nextLine();
            if (userInput.length() > 0) {
                valid = true;
            } else {
                System.out.println("Error - Must enter string of non zero length.");
            }
        } while (!valid);

        return userInput;
    }

    //returns a valid int value back to the user
    public static int getInt(Scanner scan, String prompt) {
        //Variables
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error - Must enter a int.");
                scan.nextLine(); //Clears Scanner
            }
        } while (!valid);
        return userInput;
    }

    // returns an int within the range between a max and min given by the user
    public static int getRangeInt(Scanner scan, String prompt, int min, int max) {
        //Variables
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                } else {
                    System.out.println("Error - input must be between " + min + " and " + max + " .");
                    scan.nextLine(); //Clears Scanner
                }
            } else {
                System.out.println("Error - Must enter a integer value.");
                scan.nextLine(); //Clears Scanner
            }
        } while (!valid);
        return userInput;
    }

    // Returns a boolean, y for true, n for false
    public static boolean getYNConfirm(Scanner scan, String prompt) {
        //Variables
        boolean valid = false;
        String userInput;
        boolean yN = false;

        System.out.println(prompt);

        do {
            if (scan.hasNextLine()) {
                userInput = scan.nextLine();
                if (userInput.equalsIgnoreCase("y")) {
                    valid = true;
                    yN = true;
                } else if (userInput.equalsIgnoreCase("n")) {
                    valid = true;
                } else {
                    System.out.println("Error - input must be either y or n.");
                }
            } else {
                System.out.println("Error - input must be a string value.");
            }
        } while (!valid);
        return yN;
    }

    // get the user to put in a positive non-zero int
    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        //Variables
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput > 0) {
                    valid = true;
                } else {
                    System.out.println("Error - input must be of a positive non-zero value.");
                    scan.nextLine(); //Clears Scanner
                }
            } else {
                System.out.println("Error - input must be a integer value.");
                scan.nextLine(); //Clears Scanner
            }
        } while (!valid);
        return userInput;
    }

    // Gets a double from the user
    public static double getDouble(Scanner scan, String prompt) {
        //Variables
        boolean valid = false;
        double userInput = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error - Must enter a double.");
                scan.nextLine(); //Clears Scanner
            }
        } while (!valid);
        return userInput;
    }

    // Gets a number from the user within a range.
    public static double getRangeDouble(Scanner scan, String prompt, double min, double max) {
        //Variables
        boolean valid = false;
        double userInput = 0;

        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()) {
                userInput = scan.nextDouble();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                } else {
                    System.out.println("Error - input must be between " + min + " and " + max + " .");
                    scan.nextLine(); //Clears Scanner
                }
            } else {
                System.out.println("Error - Must enter a integer value.");
                scan.nextLine(); //Clears Scanner
            }
        } while (!valid);
        return userInput;
    }

    //Checks if user input matches pattern
    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        //Variables
        boolean valid = false;
        String userInput;

        System.out.println(prompt);

        do {
            userInput = scan.nextLine();
            if (userInput.matches(regExPattern)) {
                valid = true;
            } else {
                System.out.println("Error - Must match specified pattern.");
            }
        } while (!valid);
        return userInput;
    }

    public static double celsiusToFahrenheit(double Celsius) {
        //Variables
        double c = Celsius;
        double f;

        f = (c*(9/5)) +32;

        return f;
    }

}