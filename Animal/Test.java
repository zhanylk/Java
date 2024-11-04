package Tasks.Animal;

public class Test {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c= new Cat();
        Animals[] animals = {d, c};
        Zoo.playSounds(animals);
    }
}


