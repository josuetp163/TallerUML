package Receta;

import java.time.LocalDateTime;
import java.util.List;

public class Receta {
    protected LocalDateTime fecha;
    protected List<Medicamento> medicamentos;
    protected PlanNutricional planNutricional;

    public Receta(LocalDateTime fec,List<Medicamento> medi){
        fecha = fec;
        medicamentos = medi;
    }

    public Receta(LocalDateTime fec,List<Medicamento> medi,PlanNutricional plan){
        fecha = fec;
        medicamentos = medi;
        planNutricional = plan;
    }
}
