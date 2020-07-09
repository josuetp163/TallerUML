public class PagoTarjeta implements Pago {
  protected float monto;
  protected String numero;
  protected Date expira;
  protected String propietario;
  protected String banco;
  
  boolean realizarPago(float monto){};
  
}
