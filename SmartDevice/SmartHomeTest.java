package Tasks.SmartDevice;

public class SmartHomeTest {
    public static void main(String[] args) {

        SmartDevice lightBulb = new LightBulb();
        SmartDevice thermostat = new Thermostat();
        SmartDevice smartTV = new SmartTV();


        SmartDevice[] devices = { lightBulb, thermostat, smartTV };


        SmartHome smartHome = new SmartHome(devices);


        smartHome.turnAllOn();
        System.out.println();
        smartHome.turnAllOff();
    }
}
