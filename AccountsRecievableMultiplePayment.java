package AccountsRecievable;

import java.util.Scanner;

public class AccountsRecievableMultiplePayment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Invoice Number: ");
        String invoiceNumber = scanner.nextLine();

        System.out.println("Enter Purchase Date: ");
        String purschaseDate = scanner.nextLine();

        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter Invoice Amount: ");
        double amount = scanner.nextDouble();

        Invoice invoice = new Invoice(invoiceNumber, purschaseDate, customerName, amount);
        System.out.println("\nInvoice Created Successful!\n");
        invoice.displayInvoiceDetails();

        System.out.println("---------------------------");

        double remainingBalance = amount;
        boolean isFullyPaid = false;

        while(!isFullyPaid){
            double amountPaid;
            while(true){
                System.out.println("\nEnter Amount Paid: \n");
                amountPaid = scanner.nextDouble();

                if(amountPaid <= 0){
                    System.out.println("Error: Payment must be greater than 0!");
                } else if(amountPaid > remainingBalance){
                    System.out.println("Error: Payment amount exceeds remaining balance (%.2f)!\n", remainingBalance);
                }
            }
        }
    }
}
