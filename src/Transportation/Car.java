package Transportation;

public class Car extends SubVehicle{

    protected byte ACLevel;

    public Car(byte ACLevel, SubVehicle vehicle) {
        super(vehicle.octaneType, vehicle.speed, vehicle.engineVolume);
        this.ACLevel = ACLevel;
    }
    public Car(byte ACLevel, int octaneType, int speed, int engineVolume) {
        super(octaneType, speed, engineVolume);
        this.ACLevel = ACLevel;
    }

    public void increaseACLevel(){
        System.out.println("AC power level incremented by 1");
        ACLevel++;
    }

    @Override
    public void printVehicleDetails(){
        System.out.println("Vehicle speed: "+super.speed+"KM/H");
        System.out.println("Vehicle engine volume: "+super.engineVolume);
        System.out.println("Vehicle octane type: "+super.octaneType);
        System.out.println("Vehicle AC level: "+ACLevel);
    }
}
