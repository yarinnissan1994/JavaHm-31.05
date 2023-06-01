package Transportation;

public class SubVehicle extends Vehicle{
    protected int octaneType;

    public SubVehicle(int octaneType, int speed, int engineVolume) {
        super(speed, engineVolume);
        this.octaneType = octaneType;
    }

    public void printVehicleDetails(){
        System.out.println("Vehicle speed: "+super.speed+"KM/H");
        System.out.println("Vehicle engine volume: "+super.engineVolume);
        System.out.println("Vehicle octane type: "+octaneType);
    }
}
