import Strategy.DriveStrategy;
import Strategy.SportyDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportyDriveStrategy());
    }
}
