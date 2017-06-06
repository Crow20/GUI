package com.company;

import java.awt.*;

public class Square extends Shape {
    private static int xo = 20;

    public Square(Graphics graphic) {
        super(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Мы реальновызвались");
        graphic.setColor(Color.MAGENTA);
        graphic.fillRect(xo, 20, 100, 100);
        xo += 20;
        System.out.println(xo);
    }
}
