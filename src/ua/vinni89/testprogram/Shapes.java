package ua.vinni89.testprogram;

import java.util.Random;

/**
 * Created by А д м и н on 29.07.2017.
 */
public class Shapes {

    private static RandomShape randomShape = new RandomShape();
    private static Random countRandom = new Random();
    private static int count = countRandom.nextInt(50);

    public static void main(String[] args){
        Shape[] shapes = new Shape[count];

        for (int i = 0; i < shapes.length; i++){
            shapes[i] = randomShape.next();
        }

        for (Shape shp : shapes) {
            shp.draw();
            shp.square();
            shp.color();
        } 
    }
}
