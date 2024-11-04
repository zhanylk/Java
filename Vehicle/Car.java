package Tasks.Vehicle;

public class Car implements Vehicle{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " машина запушена");
    }

    @Override
    public void stop() {
        System.out.println(model + " машина остановлена");
    }
}
