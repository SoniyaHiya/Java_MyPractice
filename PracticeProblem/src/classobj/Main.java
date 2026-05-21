package classobj;

class Car {

    String owner;
    String brandName;
    String serialNumber;
    double fuelAmount;
    boolean isStarted;

    void startCar() {
        isStarted = true;
        System.out.println("Car Started");
    }

    void stopCar() {
        isStarted = false;
        System.out.println("Car Stopped");
    }

    void checkFuel() {
        System.out.println("Fuel Amount: " + fuelAmount + " liters");
    }
}

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.owner = "Soniya";
        c1.brandName = "Toyota";
        c1.serialNumber = "TX-101";
        c1.fuelAmount = 30;

        c1.startCar();
        c1.checkFuel();
        c1.stopCar();
    }
}