package Interfaces;

public class Computer implements I_ElectricityConsumer{
    @Override
    public void powerOn() {
        System.out.println("The computer was turned on");
    }
}
