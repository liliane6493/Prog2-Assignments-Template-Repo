//liliane ashraf
//20216493




public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("John", "ABC Bank", 1000);

        System.out.println("Initial balance of account1: " + account1.getBalance());
        System.out.println("Initial balance of account2: " + account2.getBalance());

        account2.Deposite(500);
        account2.Withdraw(200);

        System.out.println("Final balance of account2: " + account2.getBalance());

        System.out.println("Number of users in the system: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls to Deposite() function: " + BankAccount.getNumOfCalls());
        System.out.println("Number of calls to Withdraw() function: " + BankAccount.getNumOfCalls());
    }
}
