package ua.vinni89.testprogram;

import java.util.Random;

public class RandomShape {

    private Random random = new Random();

    public Shape next(){
        switch (random.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Quadrate();
            case 2: return new Triangle();
            case 3: return new Trapeze();
        }
    }
}
