class Account {
    String name;
    int accountNumber;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    PremiumSavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount savings =
            new SavingsAccount("Uvan", 101);

        CurrentAccount current =
            new CurrentAccount("Rahul", 102);

        PremiumSavingsAccount premium =
            new PremiumSavingsAccount("Arun", 103);

        System.out.println("Savings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();

        System.out.println("\nPremium Savings Account");
        premium.displayAccountDetails();
    }
}
