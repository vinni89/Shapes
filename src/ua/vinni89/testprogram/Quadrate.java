package ua.vinni89.testprogram;

import java.util.Random;

/*Класс который описывает квадрат*/
public class Quadrate extends Shape{

    private Random random = new Random();
    private int a;

    @Override
    public void draw(){
        System.out.print("Фигура: квадрат, ");
    }

    /*Метод который возвращает сторону квадрата*/
    public void side(){
        a = random.nextInt(50);
    }

    @Override
    public void square() {
        side();
        double square = a * a;
        System.out.print("площадь: " + square + " кв. ед., длина стороны: " + a + " ед., ");
    }
}
