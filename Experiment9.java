class ReservationThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Reservation Status: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class StatusThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Confirmation Status: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Exp9 {
    public static void main(String[] args) {
        ReservationThread t1 = new ReservationThread();

        StatusThread s = new StatusThread();
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }
}
