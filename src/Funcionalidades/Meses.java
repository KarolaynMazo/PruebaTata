package Funcionalidades;


public class Meses {
    int enero;

    public double Febrero(int enero){
        double ganancia;
        ganancia = enero/2;
        return ganancia;
    }

    public double Marzo(int enero){
        double ganancia;
        ganancia = enero*2;
        return ganancia;
    }

    public double Abril(int enero){
        double ganancia;
        double marzo;
        marzo = Marzo(enero);
        ganancia = marzo*0.80;
        return ganancia;
    }

    public double Mayo(int enero){
        double ganancia;
        double marzo = Marzo(enero);
        double febrero = Febrero(enero);
        ganancia = (febrero+marzo)/3;
        return ganancia;
    }
    public double Junio(int enero){
        double ganancia;
        double marzo = Marzo(enero);
        double febrero = Febrero(enero);
        double abril = Abril(enero);
        double mayo = Mayo(enero);
        double promedio = (enero+febrero+marzo+abril+mayo)/5;
        ganancia = promedio;
        return ganancia;
    }

    public double semestre(int enero){
        double marzo = Marzo(enero);
        double febrero = Febrero(enero);
        double abril = Abril(enero);
        double mayo = Mayo(enero);
        double junio = Junio(enero);
        double sumatoria = enero+febrero+marzo+abril+mayo+junio;
        return sumatoria;
    }










}
