//liliane ashraf safwat
// 20216493

public class BankAccount {
    private static int NumOfUsers = 0;
    private static int NumOfCalls = 0;
    private final String country = "Egypt";
    private String username;
    private String bankname;
    private double balance;

    public BankAccount() {
        NumOfUsers++;
        System.out.println("A new BankAccount object has been created.");
        this.balance = 0;
        this.username = "";
        this.bankname = "";
    }

    public BankAccount(String username, String bankname, double balance) {
        NumOfUsers++;
        System.out.println("A new BankAccount object has been created.");
        this.balance = balance;
        this.username = username;
        this.bankname = bankname;
    }

    public void Deposite(double amount) {
        NumOfCalls++;
        balance += amount;
    }

    public void Withdraw(double amount) {
        NumOfCalls++;
        balance -= amount;
    }

    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfCalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    public String getCountry() {
        return country;
    }
}
