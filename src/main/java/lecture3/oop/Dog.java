package lecture3.oop;

import java.awt.*;

public class Dog extends Animal implements Breathable {

    public Dog(Color color) {
        super(color);
    }

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void run() {

    }

    public void write() {
        System.out.println("I'm writing...");
    }

    public void write(String text) {
        System.out.println(text);
    }

    public void write(String text, boolean trueFalse) {
        if (trueFalse) {
            System.out.println(text);
        }
    }

    @Override
    public void breath() {

    }
}
