package com.company;

import javax.swing.*;
import java.awt.*;

public class Square extends Shape {
    private static int xo = 20;

    public Square(JPanel p) {
        super(p);
    }

    @Override
    public void draw() {
        System.out.println("Мы реальновызвались");
        p.getGraphics().setColor(Color.MAGENTA);
        p.getGraphics().fillRect(xo, 20, 100, 100);
        xo += 1;
        System.out.println(xo);
    }
}
