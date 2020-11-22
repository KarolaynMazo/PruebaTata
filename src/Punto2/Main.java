package Punto2;


import Punto2.From2.PuntoDos2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new PuntoDos2();
                frame.setSize(800,500);
                frame.setVisible(true);
            }
        });

    }
}
