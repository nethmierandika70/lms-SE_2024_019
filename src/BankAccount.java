public class BankAccount {

        private String accountNumber;
        private String ownerName;
        private double balance;

        public BankAccount(String accountNumber, String ownerName, double initializeBalance){
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = initializeBalance;
        }

        public String getAccountNumber(){
            return accountNumber;
        }
        public  String getOwnerName(){
            return ownerName;
        }
        public double getBalance(){
            return balance;
        }

        public void deposit(double deposit){

            if(deposit <= 0){
                System.out.printf("Enter Valid Amount");
            } else  {
                balance += deposit;
                System.out.printf("Deposit amount is: "+ deposit);
            }
        }
        public void withdraw(double withdraw){
            if(withdraw > balance){
                System.out.printf("Insufficient Balance");
            }
            else{
                balance -= withdraw;
                System.out.printf("Withdraw Amount is: " +withdraw);
            }
        }




}
