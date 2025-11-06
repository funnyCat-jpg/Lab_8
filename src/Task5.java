import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variables
        String ssn;
        String studentMNum;
        String menu;

        ssn = InputHelper.getRegExString(scanner, "Enter your SSN [xxx-xx-xxxx]: ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);

        studentMNum = InputHelper.getRegExString(scanner, "Enter your Student M number[M/mxxxxx]: ", "(M|m)\\d{5}");
        System.out.println("Your Student M number is: " + studentMNum);

        menu = InputHelper.getRegExString(scanner, "Menu O - Open S - Save V - Vice Q - Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menu);
    }
}
