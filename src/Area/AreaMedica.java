package Area;
import java.util.ArrayList;

public class AreaMedica {
  protected String especialidad;
  protected float costo;
  protected ArrayList<Doctor> doctores;
  
  public AreaMedica(String s, float c){
    especialidad = s;
    costo = c;
  }
  
  public boolean agregarDoctor(Doctor d) {}
}
