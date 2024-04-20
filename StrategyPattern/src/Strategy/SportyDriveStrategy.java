package Strategy;

public class SportyDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is a sporty drive");
    }
}
