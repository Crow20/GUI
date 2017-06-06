package com.company;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //JFrame.setDefaultLookAndFeelDecorated(true);
//        Window window=new Window();
//        window.setLocationRelativeTo(null);
//        window.setVisible(true);

        try {
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        javax.swing.SwingUtilities.invokeLater(Window::new);
    }

}
