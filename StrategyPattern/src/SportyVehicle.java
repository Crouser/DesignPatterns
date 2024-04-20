import Strategy.DriveStrategy;
import Strategy.SportyDriveStrategy;

public class SportyVehicle extends Vehicle{
    SportyVehicle() {
        super(new SportyDriveStrategy());
    }
}
