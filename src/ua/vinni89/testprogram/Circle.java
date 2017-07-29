package ua.vinni89.testprogram;

import java.util.Random;

/*Класс который описывает круг*/
public class Circle extends Shape{

    private Random random = new Random();
    private int r;

    @Override
    public void draw() {
        System.out.print("Фигура: круг, ");
    }

    /*Метод который возвращает радиус круга*/
    public void radius(){
        r = random.nextInt(50);
    }

    @Override
    public void square() {
        radius();
        double square = 3.14 * r * r;
        System.out.print("площадь: " + square + " кв. ед., длина радиуса: " + r + " ед., ");
    }
}
