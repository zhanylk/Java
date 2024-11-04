package Tasks.Animal;

public class Zoo {
    // Метод, принимающий список животных и вызывающий их методы makeSound()
    public static void playSounds(Animals[] animals) {
        for (Animals animal : animals) {
            animal.makeSound();
        }
    }

}
