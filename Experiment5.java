class Payment {

    void makePayment(double amount) {
        System.out.println("Payment Amount: " + amount);
    }

    void makePayment(double amount, String cardNumber) {
        System.out.println("Payment Amount: " + amount);
        System.out.println("Card Number: " + cardNumber);
    }

    void makePayment(String upiId, double amount) {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Amount: " + amount);
    }
}

class UPIPayment extends Payment {

    void makePayment(double amount) {
        System.out.println("UPI Payment Amount: " + amount);
        System.out.println("Payment successful using UPI.");
    }
}

public class Main {
    public static void main(String[] args) {

        UPIPayment payment = new UPIPayment();

        System.out.println("Overloaded Methods:");
        payment.makePayment(1000.0, "1234567890");
        payment.makePayment("uvan@upi", 1500.0);

        // Runtime polymorphism - overridden method
        System.out.println("\nOverridden Method:");
        payment.makePayment(2000.0);
    }
}
