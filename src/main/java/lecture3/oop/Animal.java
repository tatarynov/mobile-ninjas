package lecture3.oop;

import java.awt.*;

abstract class Animal {

    protected Color animalColor;
    private int steps = 0;

    public void run() {
        steps = steps + 50;
    }

    protected int getSteps() {
        return steps;
    }

    public Animal(Color color) {
        animalColor = color;
        System.out.println("Initializing object");
    }

    abstract void makeSound();
}
