package Receta;

public class Medicamento {
    protected String medicina;
    protected  String dosis;
    protected String observaciones;
    protected int cantidadTotal;
    protected String unidad;

    public Medicamento(String med,String dos,String obs,int cant, String uni){
        medicina = med;
        dosis = dos;
        observaciones = obs;
        cantidadTotal = cant;
    }
}
