package Punto2.Funcionalidad;

public class Lista {
    Nodo cabeza;

    public Lista() {
        this.cabeza = cabeza;
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

    public void Insertar(String nombre, String apellido, int celular, String ciudad, int ingMensual){
        Nodo x = new Nodo(nombre,apellido,celular,ciudad,ingMensual);
        x.setLiga(cabeza);
        cabeza = x;
    }

    public Nodo buscar(String nombre) {
        Nodo nodo = cabeza;

        if (!estaVacio()) {
            while (nodo.getNombre() != nombre) {

                if (nodo.getLiga() == null) {
                    return null;
                } else {
                    nodo = nodo.getLiga();
                }
            }
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




}
