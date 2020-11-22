package Punto1;


import Punto1.From.PuntoUno;

import javax.swing.*;

public class Main {
    public static void main(String[]args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new PuntoUno();
                frame.setSize(800, 500);
                frame.setVisible(true);
            }
        });

    }
}
