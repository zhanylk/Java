package Tasks.Vehicle1;

public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Велсипед начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Велоспиед остоновил движение");
    }
}
