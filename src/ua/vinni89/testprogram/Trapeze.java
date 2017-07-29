package ua.vinni89.testprogram;

import java.util.Random;

/*Класс который описывает трапецию*/
public class Trapeze extends Shape{

    private Random random = new Random();
    private int a;
    private int b;
    private int h;

    @Override
    public void draw() {
        System.out.print("Фигура: трапеция, ");
    }

    /*Метод который возвращает основы и высоту трапеции*/
    public void basisAndHight(){
        a = random.nextInt(50);
        b = random.nextInt(50);
        h = random.nextInt(50);
    }

    @Override
    public void square() {
        basisAndHight();
        double square = ((a + b)/2) * h;
        System.out.print("площадь: " + square + " кв. ед., размеры основ: " + a + " ед., " + b + " ед., длина высоты: " + h + " ед., ");
    }
}
