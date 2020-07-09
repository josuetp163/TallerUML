public class PagoPayPal implements Pago {
  protected float monto;
  protected String email;
  
  public boolean realizarPago(float monto){
    return true;
  };
  
}
