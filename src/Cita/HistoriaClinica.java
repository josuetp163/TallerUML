package Cita;
import java.util.ArrayList;

public class HistoriaClinica {
  protected int nro;
  protected ArrayList<String> enfermedades;
  protected ArrayList<String> alergias;
  protected ArrayList<String> otros;
  
  public HistoriaClinica(int n, ArrayList<String> e, ArrayList<String> a, ArrayList<String> o) {
    nro = n;
    enfermedades = e;
    alergias = a;
    otros = o;
  }
}
