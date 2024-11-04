package Tasks.Vehicle1;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Автомобиль добавлен в гараж");
    }


    public void startAllVehicles() {
        System.out.println("Запускаем все транспортные средства в гараже");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }


    public void stopAllVehicles() {
        System.out.println("Остановка всех транспортных средств в гараже");
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }
    }
}
