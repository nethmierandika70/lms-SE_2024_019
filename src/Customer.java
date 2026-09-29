public class Customer {
    private  String ownerName;
    private int customerID;

    public Customer(String ownerName, int customerID){
        this.ownerName = ownerName;
        this.customerID = customerID;
    }

    public void CustomerDetail(BankAccount bankAccount){

        System.out.printf("Customer Name: "+ownerName);
        System.out.printf("Customer ID: "+customerID);
        System.out.printf("Account Number: "+bankAccount.getAccountNumber());
        System.out.printf("Balance: "+bankAccount.getBalance());
    }
}
