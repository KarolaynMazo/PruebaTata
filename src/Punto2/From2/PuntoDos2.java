package Punto2.From2;

import Punto2.Funcionalidad.Lista;
import Punto2.Funcionalidad.Nodo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuntoDos2 extends JFrame {
    private JTextField nombre;
    private JTextField apellido;
    private JTextField celular;
    private JTextField ciudad;
    private JTextField ingreso;
    private JPanel panel1;
    private JButton generarReporteButton;
    private JButton buscarButton;
    private JTable tablaSi;
    private JButton eliminarButton;

    Lista empleados = new Lista();
    DefaultTableModel tb = new DefaultTableModel();


    public PuntoDos2(){
        setContentPane(panel1);

        //tabla
        tb = (DefaultTableModel) tablaSi.getModel();

        tb.addColumn("Nombre ");
        tb.addColumn("Apellido");
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
                    tablaSi.setModel(tb);
                    int cel = Integer.parseInt(celular.getText());
                    int IngMen = Integer.parseInt(ingreso.getText());
                    empleados.Insertar(nombre.getText(),apellido.getText(),cel,ciudad.getText(),IngMen);
                    empleados.Mostrar();
                   llenartabla();
                   limpiar();
                   tablaSi.getModel();
                   tablaSi.setVisible(true);

                }


            }
        });{


        }

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreB = JOptionPane.showInputDialog("introduzca el nombre a buscar");

                if(empleados.estaVacio()){
                    JOptionPane.showMessageDialog(null,"Lista de empleados esta vacia, agrege primero");
                }else{
                    Nodo referencia = empleados.buscar(nombreB);

                    System.out.println(referencia);

                    nombre.setText( referencia.getNombre());
                    apellido.setText(referencia.getApellido());
                    celular.setText(Integer.toString(referencia.getCelular()));
                    ciudad.setText(referencia.getCiudad());
                    ingreso.setText(Integer.toString(referencia.getIngMensual()));

                }

            }
        });

       eliminarButton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {

               int index = tablaSi.getSelectedRow();
               if(index <0){
                   JOptionPane.showMessageDialog(null,"Debe seleccionar una fila en la tabla");
               }
               else{
                    Nodo x = empleados.buscar(tablaSi.getValueAt(index,0).toString());
                   System.out.println(tablaSi.getValueAt(index,0).toString());
                    if(x!=null){
                        empleados.eliminarNodo(x.getPosicion());
                        tb.removeRow(index);
                        JOptionPane.showMessageDialog(null, "El empleado fue eliminado con exito");
                    }

               }
               limpiar();

           }
       });



    }
    public void llenartabla(){



        Nodo x = empleados.getCabeza();
        Object O[] = null;
        int i =0;
        int impuesto;

        while(x != null){

            if(x.getIngMensual()>1500000){
                impuesto= x.getIngMensual()*2;
            }else{
                impuesto= x.getIngMensual()/2;
            }

            tb.addRow(O);
            tb.setValueAt(x.getNombre(),i,0);
            tb.setValueAt(x.getApellido(),i,1);
            tb.setValueAt(x.getCelular(), i,2);
            tb.setValueAt(x.getCiudad(), i,3);
            tb.setValueAt(x.getIngMensual(), i,4);
            tb.setValueAt(x.getIngTrimestral(), i,5);
            tb.setValueAt(x.getIngSemestral(), i,6);
            tb.setValueAt(x.getIngAnual(), i,7);
            tb.setValueAt(impuesto,i,8);
            i++;
        x=x.getLiga();
        }
        this.tablaSi.setModel(tb);

    }

    void limpiar() {
        nombre.setText("");
        apellido.setText("");
        celular.setText("");
        ciudad.setText("");
        ingreso.setText("");
        tablaSi.updateUI();
    }



}
