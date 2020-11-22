package Punto2.From2;

import Punto2.Funcionalidad.Lista;
import Punto2.Funcionalidad.Nodo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuntoDos2 extends JFrame {
    private JTextField nombre;
    private JTextField apellido;
    private JTextField celular;
    private JTextField ciudad;
    private JTextField ingreso;
    private JTable tabla;
    private JPanel panel1;
    private JButton generarReporteButton;
    private JButton buscarButton;

    Lista empleados = new Lista();
    DefaultTableModel tb = new DefaultTableModel();


    public PuntoDos2(){

        setContentPane(panel1);

        //tabla
        tb = (DefaultTableModel) tabla.getModel();

        tb.addColumn("Nombre y Apellido");
        tb.addColumn("Celular");
        tb.addColumn("Ciudad");
        tb.addColumn("Ing Mensual");
        tb.addColumn("Ing Trimestre");
        tb.addColumn("Ing Semestre");
        tb.addColumn("Ing Anual");
        tb.addColumn("Impuesto");
       // this.tablaEmpleado.setModel(tbEmp);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Object O[] = null;
        tb.addRow(O);


        generarReporteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(nombre.getText().equals("") || apellido.getText().equals("") || celular.getText().equals("") ||
                        ciudad.getText().equals("") || ingreso.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos");

                }else{
                    tabla.setModel(tb);
                    int cel = Integer.parseInt(celular.getText());
                    int IngMen = Integer.parseInt(ingreso.getText());
                    empleados.Insertar(nombre.getText(),apellido.getText(),cel,ciudad.getText(),IngMen);
                    empleados.Mostrar();
                   llenartabla();
                   limpiar();
                   tabla.setVisible(true);

                }


            }
        });{


        }

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreB = JOptionPane.showInputDialog("introduzca el nombre a buscar");
                Nodo referencia = empleados.buscar(nombreB);


                nombre.setText( referencia.getNombre());
                apellido.setText(referencia.getApellido());
                celular.setText(Integer.toString(referencia.getCelular()));
                ciudad.setText(referencia.getCiudad());
                ingreso.setText(Integer.toString(referencia.getIngMensual()));
            }
        });



    }
    public void llenartabla(){
        Nodo x = empleados.getCabeza();
        Object O[] = null;
        int i =1;
        int impuesto;

        while(x != null){

            if(x.getIngMensual()>1500000){
                impuesto= x.getIngMensual()*2;
            }else{
                impuesto= x.getIngMensual()/2;
            }

            tb.addRow(O);
            tb.setValueAt(x.getNombre()+x.getApellido(),i,0);
            tb.setValueAt(x.getCelular(), i,1);
            tb.setValueAt(x.getCiudad(), i,2);
            tb.setValueAt(x.getIngMensual(), i,3);
            tb.setValueAt(x.getIngTrimestral(), i,4);
            tb.setValueAt(x.getIngSemestral(), i,5);
            tb.setValueAt(x.getIngAnual(), i,6);
            tb.setValueAt(impuesto,i,7);
            i++;
        x=x.getLiga();
        }




    }

    void limpiar() {
        nombre.setText("");
        apellido.setText("");
        celular.setText("");
        ciudad.setText("");
        ingreso.setText("");
        tabla.updateUI();
    }



}
