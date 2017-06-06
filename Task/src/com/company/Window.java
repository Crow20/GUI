package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Crow on 06.06.2017.
 */
public class Window extends JFrame implements ActionListener {

    Timer tm = new Timer(400, this);
    int x = 0, velX = 2;
    Square square = null;

    Window() {
        super("My First Window"); //Заголовок окна
        JPanel panel = new MyPanel();
        panel.setLayout(new FlowLayout());
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Start!");
        JButton stopButton = new JButton("Stop!");
        button.addActionListener(this);
        stopButton.addActionListener(e -> {
            Thread thread = new Thread((Runnable) panel, "Анимация");
            thread.start();
            System.out.println("ПИПИСЬКА");
            System.out.println("ТУТ ЕСТЬ");
        });
        panel.add(button);
        panel.add(stopButton);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
        if (square == null)
            square = new Square(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + velX;
        //repaint();
        tm.start();
    }

    class MyPanel extends JPanel implements Runnable {
        public MyPanel() {
            super();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.black);
            g.drawLine(x, x, -50, 300);

            square.draw();
        }

        @Override
        public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Я ПРОСНУЛСЯ НАХРЕН!!!111");
            repaint();
            square.draw();
        }
    }
}
