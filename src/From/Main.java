package From;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[]args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Principal();
                frame.setSize(800,400);
                frame.setVisible(true);


            }
        });
    }
}
