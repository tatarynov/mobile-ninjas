package lecture3.oop;

import java.awt.*;

public class Runner {

    public static void main(String[] args) {
        Animal frog = new Frog(Color.BLACK);
        Animal dog = new Dog(Color.BLUE);
        Animal sheep = new Sheep(Color.WHITE);

        dog.makeSound();
        frog.makeSound();
        sheep.makeSound();
    }
}
