package problema8;

public class Problema_8_ChequeBase {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Problema_8_ChequeBase(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComisionBanco();
    }

    private void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.003 / 100;
    }

    @Override
    public String toString() {
        return String.format("""
            Cliente: %s
            Banco: %s
            Valor del Cheque: %.2f
            Comisión del Banco (0.003%%): %.6f
            """, nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
