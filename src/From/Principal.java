package From;

import Funcionalidades.Meses;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Principal extends JFrame{
    private JTextField nombreAdmin;
    private JTextField apellidoAdmin;
    private JTextField ganaciaEnero;
    private JButton generarReporteButton;
    private JTable tabla;
    private JPanel panel1;


    ArrayList meses = new ArrayList();
    DefaultTableModel tb;
    Meses listado = new Meses();

    public Principal(){

        setContentPane(panel1);
        
        

        //tabla
        tb = (DefaultTableModel)tabla.getModel();
        tb.addColumn("Nombre y Apellido");
        tb.addColumn("Enero");
        tb.addColumn("Febrero");
        tb.addColumn("Marzo");
        tb.addColumn("Abril");
        tb.addColumn("Mayo");
        tb.addColumn("Junio");
        tb.addColumn("Semestre");
       //this.tabla.setModel(tb);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Object O[] = null;
        tb.addRow(O);




        generarReporteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(nombreAdmin.getText().equals("") || apellidoAdmin.getText().equals("") || ganaciaEnero.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos");

                }else{
                    tabla.setModel(tb);
                    int enero = Integer.parseInt(ganaciaEnero.getText());
                    double febrero = listado.Febrero(enero);
                    double marzo = listado.Marzo(enero);
                    double abril = listado.Abril(enero);
                    double mayo = listado.Mayo(enero);
                    double junio = listado.Junio(enero);
                    double semestre = listado.semestre(enero);

                    meses.add(enero);
                    meses.add(febrero);
                    meses.add(marzo);
                    meses.add(abril);
                    meses.add(mayo);
                    meses.add(junio);
                    meses.add(semestre);
                    llenartabla();
                    tabla.setVisible(true);
                    System.out.println(meses);
                }


            }
        });{


        }
        }
        public void llenartabla(){
            int enero = 4000;
            Object O[] = null;
            int i =0;


                    for(int j=1; j< 8; j++){
                    tb.addRow(O);
                    tb.setValueAt(nombreAdmin.getText()+" "+apellidoAdmin.getText(),0,0);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    tb.setValueAt(meses.get(i), 0,j);
                    i++;

                }




        }

    }






