package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Crow on 07.06.2017.
 */
public abstract class Shape {

    public int y = 0;
    public int x = 0;
    public int velY = 2;
    Graphics graphic;
    JPanel p;

    public Shape(Graphics graphic) {
        this.graphic = graphic;
    }

    public void draw() {
    }
}
