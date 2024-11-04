package Tasks.SmartDevice;

public class SmartTV implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Умный телевизор включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Умный телевизор выключен");
    }
}
