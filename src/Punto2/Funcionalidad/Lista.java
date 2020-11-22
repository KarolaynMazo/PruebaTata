package Punto2.Funcionalidad;

public class Lista {
    Nodo cabeza;
    int cantidadNodos;

    public Lista() {
        this.cabeza = cabeza;
        this.cantidadNodos =0;
    }

    public boolean estaVacio() {
        return (cabeza == null);
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getCantidadNodos() {
        return cantidadNodos;
    }

    public void Insertar(String nombre, String apellido, int celular, String ciudad, int ingMensual){
        Nodo x = new Nodo(nombre,apellido,celular,ciudad,ingMensual);
        x.setLiga(cabeza);
        cabeza = x;
        x.setPosicion(x.getPosicion()+1);
        cantidadNodos++;
    }

    public Nodo buscar(String nombre) {
        Nodo nodo = cabeza;

        if (!estaVacio()) {

            while (!nodo.getNombre().equals(nombre)) {

                if (nodo.getLiga() == null) {
                    return null;
                } else {
                    nodo = nodo.getLiga();
                }
            }
        } else {
            System.out.println("Lista esta vacia");
        }
        return nodo;
    }

    public void Mostrar(){
        Nodo Nodo = cabeza;
        while (Nodo != null) {
            System.out.println(Nodo.getNombre());
            Nodo = Nodo.getLiga();
            System.out.println();
        }
    }


    public Nodo eliminarNodo(int  posi) {
        Nodo Siguiente = cabeza;
        Nodo actual = cabeza;

            while (actual.getPosicion() != posi) {

                if (actual.getLiga() == null) {
                    return null;
                } else {
                    Siguiente = actual;
                    actual = actual.getLiga();
                }
            }
            if (actual == cabeza) {
                cabeza = cabeza.getLiga();
            } else {
                Siguiente.setLiga(actual.getLiga());
            }


        return actual;
        }










}
