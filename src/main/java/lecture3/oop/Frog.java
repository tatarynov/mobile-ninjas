package lecture3.oop;

import java.awt.*;

public class Frog extends Animal implements Breathable {

    public Frog(Color color) {
        super(color);
    }

    public void makeSound() {
        System.out.println("Kva?!WTF?");
    }

    public void run() {

    }

    public void write() {

    }

    @Override
    public void breath() {

    }
}
