import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = InputHelper.getNonZeroLenString(scanner, "Enter a Username: ");
        System.out.println("The Username is: " + username);
    }
}
