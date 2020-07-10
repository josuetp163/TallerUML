package Cita;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import Pago.*;

public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradaPor;

    public Cita(LocalDateTime fec, boolean pag, String regis){
        fecha = fec;
        pagada = pag;
        registradaPor = regis;
    }
}
