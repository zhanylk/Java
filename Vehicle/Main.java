package Tasks.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Тайота");
        Bicycle bike = new Bicycle("Велик");

        Garage garage = new Garage();

        garage.parkVehicle(car);
        garage.startVehicle();
        garage.stopVehicle();

        garage.parkVehicle(bike);
        garage.startVehicle();
        garage.stopVehicle();
    }
    }

