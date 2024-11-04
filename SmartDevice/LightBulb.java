package Tasks.SmartDevice;

public class LightBulb implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Лампочка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампочка выклчена");
    }
}
