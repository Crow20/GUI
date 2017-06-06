package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Crow on 06.06.2017.
 */
public class Window extends JFrame implements ActionListener{

    Timer tm=new Timer(5,this);
    int x=0, velX=2;

    Window() {
        super("My First Window"); //Заголовок окна
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Start!");
        JButton stopButton = new JButton("Stop!");
        button.addActionListener(this);
        stopButton.addActionListener(e -> {
            System.out.println("ПИПИСЬКА");
            System.out.println("ТУТ ЕСТЬ");
        });
        panel.add(button);
        panel.add(stopButton);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x=x+velX;
        repaint();
        tm.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.black);
        gr2d.setPaint(Color.black);
            gr2d.drawLine(x, 50, -50, 300);

    }
}