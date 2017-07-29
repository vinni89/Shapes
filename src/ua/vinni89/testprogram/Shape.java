package ua.vinni89.testprogram;

import java.util.Random;

/*Класс который описывает фигуру*/
public class Shape {

    private Random random = new Random();
    private String color;

    /*Метод который рисует фигуру*/
    public void draw(){}

    /*Метод который вычисляет площадь фигуры*/
    public void square(){}

    /*Метод который задает цвет фигуры*/
    public void color(){
        int c = random.nextInt(4);
        if (c == 0)color = "синий";
        if (c == 1)color = "желтый";
        if (c == 2)color = "зеленый";
        if (c == 3)color = "красный";
        System.out.println("цвет: " + color);
    }
}