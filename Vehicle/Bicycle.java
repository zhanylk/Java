package Tasks.Vehicle;

public class Bicycle implements Vehicle{
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(type + " велосипед начал движение");
    }

    @Override
    public void stop() {
        System.out.println(type + " велосипед остановлен");
    }
}
