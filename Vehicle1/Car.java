package Tasks.Vehicle1;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Машина начала движение");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановлена");
    }
}
