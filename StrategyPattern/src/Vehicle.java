import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //constructor injection
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    void drive() {
        driveStrategy.drive();
    }
}
