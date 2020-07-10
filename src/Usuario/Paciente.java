package Usuario;

import Cita.Cita;
import Cita.HistoriaClinica;
import Receta.Receta;

public class Paciente extends Persona {
    protected String email;
    protected Cita cita;
    protected HistoriaClinica historiaClinica;
    protected Receta receta;

    public boolean solicitarCita(){
        return true;
    }

}
