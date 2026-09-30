import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {

    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal cannot be completed."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Updated Balance: " + balance);
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Input! Please enter numbers only.");
        }

        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}
