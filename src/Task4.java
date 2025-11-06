import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variables
        double item;
        double total = 0;
        boolean contYN;

        do {
            item = InputHelper.getRangeDouble(scanner, "Enter the price of your item [.50-9.99]: ", .50, 9.99);
            total += item;
            scanner.nextLine();
            contYN = InputHelper.getYNConfirm(scanner, "Would you like to add another item [Y or N]: ");
        } while(contYN);

        System.out.printf("%-1s%10.2f", "Total Cost: ", total);
    }
}
