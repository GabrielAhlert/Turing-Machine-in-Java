package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Configurator {
    private static JFrame frame;
    private JPanel mainPanel;
    private JTextField txtInput;
    private JTextField txtReader;
    private JTextField txtStartState;
    private JButton okButton;
    private JTextPane txtPanel;


    public Configurator() {
        okButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Runing.Run();
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        frame= new JFrame("Configuração da Maquina");
        frame.setContentPane(new Configurator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
