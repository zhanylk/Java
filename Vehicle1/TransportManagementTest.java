package Tasks.Vehicle1;

public class TransportManagementTest {
    public static void main(String[] args) {
        Garage garage = new Garage();


        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();


        garage.addVehicle(car);
        garage.addVehicle(bicycle);


        System.out.println();
        garage.startAllVehicles();
        System.out.println();
        garage.stopAllVehicles();
    }
}
