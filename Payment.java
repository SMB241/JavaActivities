package AccountsRecievable;

public class Payment extends Invoice{
    private double amountPaid;
    private String paymentDate;
    private String paymentMethod;
    private String checkNumber;
    private String checktype;

public Payment(String invoiceNUmber, String purchaseDate, String customerName, double amount, double amountPaid, String paymentDate, String paymentMethod, String checkNumber, String checktype){
    super(invoiceNUmber, purchaseDate, customerName, amount);
    this.amountPaid = amountPaid;
    this.paymentDate = paymentDate;
    this.paymentMethod = paymentMethod;
    this.checkNumber = checkNumber;
    this.checktype = checktype;
    }

    public void displayPaymentDetails(){
        displayInvoiceDetails();
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Method" + paymentMethod);

        if (paymentDate.equals("check")){
            System.out.println("Check Type: " + checktype);
            System.out.println("Check Number: " + checkNumber);
        }
    }
}


