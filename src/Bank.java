public class Bank {
    private int AccountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank() {
        this(56789, 2.50, "Default email", "Default name", "Default phone number");
// above will call another constructor within a constructor
//  if an object is created without any parameters, these are the parameters that will be used
    }

    public Bank (int AccountNumber, double balance, String email, String name, String phoneNumber) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("You have deposited £" + deposit + "0");
        System.out.println("Your current balance is £" + this.balance + "0");
    }
    public void withdrawFunds (double withdraw) {
        if (this.balance < 0) {
            System.out.println("You do not have enough money to withdraw £" + withdraw + "0");
            System.out.println("Your current balance is £" + this.balance + "0");
        } else {
            this.balance -= withdraw;
        }
    }

// below are getters and setters
// they're used to protect your data
// a getter method returns its value
// a setter method sets or updates its value
    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
