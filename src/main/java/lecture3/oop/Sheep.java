package lecture3.oop;

import java.awt.*;

public class Sheep extends Animal implements Breathable {

    public Sheep(Color color) {
        super(color);
    }

    public void makeSound() {
        System.out.println("Beeeee!");
    }

    public void run() {

    }

    public void write() {

    }

    @Override
    public void breath() {

    }
}
