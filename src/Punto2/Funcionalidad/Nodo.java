package Punto2.Funcionalidad;

public class Nodo {
    String nombre;
    String apellido;
    int celular;
    String ciudad;
    int ingMensual;
    Nodo liga;
    int ingTrimestral;
    int ingSemestral ;
    int ingAnual ;
    int posicion;
    public Nodo(String nombre, String apellido, int celular, String ciudad, int ingMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.ciudad = ciudad;
        this.ingMensual = ingMensual;
        this.ingTrimestral = ingMensual*3;
        this.ingSemestral = ingMensual *6;
        this.ingAnual = ingMensual * 12;
        this.posicion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getIngMensual() {
        return ingMensual;
    }

    public void setIngMensual(int ingMensual) {
        this.ingMensual = ingMensual;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public int getIngTrimestral() {
        return ingTrimestral;
    }

    public int getIngSemestral() {
        return ingSemestral;
    }

    public int getIngAnual() {
        return ingAnual;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
