package Tasks.Vehicle;

public class Garage {
    private Vehicle vehicle;

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Трансорт в гараже");
    }

    public void startVehicle() {
        if (vehicle != null) {
            vehicle.start();
        } else {
            System.out.println("В граже нет транспорта");
        }
    }

    public void stopVehicle() {
        if (vehicle != null) {
            vehicle.stop();
        } else {
            System.out.println("В граже нет транспорта");
        }
    }
}
