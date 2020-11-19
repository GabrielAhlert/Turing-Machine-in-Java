package com.company;

import javax.swing.*;

public class Runing {
    private JPanel mainPanel;

    public static void Run(){

        System.out.println("Ok");

        JFrame frame = new JFrame("Runing ...");
        frame.setContentPane(new Runing().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
