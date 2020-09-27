import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter the Customer ID:");
        String customerId = scanner.nextLine();
        BankAccount bankAccount = new BankAccount(customerName, customerId);
        bankAccount.showMenu();
    }
}

