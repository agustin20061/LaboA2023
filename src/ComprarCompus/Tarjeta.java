package ComprarCompus;

public class Tarjeta  {
   private int numTarjeta;
    private String banco;
    private Boolean creditoDebito;

    public Tarjeta(String nombreCliente, String apellido, int celular, int numTarjeta, String banco, Boolean creditoDebito) {
        this.numTarjeta = numTarjeta;
        this.banco = banco;
        this.creditoDebito = creditoDebito;
    }

    public Tarjeta() {

    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Boolean getCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(Boolean creditoDebito) {
        this.creditoDebito = creditoDebito;
    }
}
