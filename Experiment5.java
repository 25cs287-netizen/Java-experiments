class Payment {

    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Payment.");
    }

    void makePayment(double amount, String method) {
        System.out.println("Payment of Rs." + amount +
                           " made using " + method + ".");
    }

    void makePayment(double amount, String method, String transactionId) {
        System.out.println("Payment of Rs." + amount +
                           " made using " + method + ".");
        System.out.println("Transaction ID: " + transactionId);
    }
}

class UPIPayment extends Payment {
    
    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount +
                           " made using UPI.");
    }
}

public class Main {

    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();

        System.out.println("----- Compile Time Polymorphism -----");

        upi.makePayment(500);
        upi.makePayment(1000, "UPI");
        upi.makePayment(1500, "UPI", "TXN12345");

        System.out.println();

        System.out.println("----- Run Time Polymorphism -----");

        Payment payment = new UPIPayment();
        payment.makePayment(2000);
    }
}
