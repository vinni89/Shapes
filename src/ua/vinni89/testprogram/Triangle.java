package ua.vinni89.testprogram;

import java.util.Random;

/*Класс который описывает треугольник*/
public class Triangle extends Shape {

    private Random random = new Random();
    private int c;
    private int a;

    @Override
    public void draw() {
        System.out.print("Фигура: треугольник, ");
    }

    /*Метод который возвращает сторону и гипотенузу треугольника*/
    public void hypotenuseAndSide(){
        c = random.nextInt(50);
        a = random.nextInt(50);
        if (a >= c) c = c + a;
    }

    @Override
    public void square() {
        hypotenuseAndSide();
        double b = Math.sqrt((c * c) - (a * a));
        double square = a * b / 2;
        System.out.print("площадь: " + square + " кв. ед., длина гипотенузы: " + c + " ед., длина стороны: " + a + " ед., ");
    }
}
