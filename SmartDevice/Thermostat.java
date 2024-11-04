package Tasks.SmartDevice;

public class Thermostat implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Термостат в настоящее время включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Термостат в настоящее время выключен");
    }
}
