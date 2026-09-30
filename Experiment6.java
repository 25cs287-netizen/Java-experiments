interface RemoteControl {
    void turnOn();
    void turnOff();
}
abstract class Appliance {
    abstract void displayAppliance();
}
class SmartTV extends Appliance implements RemoteControl {
    String brand = "Samsung";
    boolean status = false;

    public void turnOn() {
        status = true;
        System.out.println("Smart TV is turned ON");
    }

    public void turnOff() {
        status = false;
        System.out.println("Smart TV is turned OFF");
    }

    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
        System.out.println("Brand: " + brand);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

public class Main {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();
        
        Appliance a = tv;
        a.displayAppliance();

        RemoteControl r = tv;
        r.turnOn();

        a.displayAppliance();

        r.turnOff();

        a.displayAppliance();
    }
}
