package problema4;
public class Problema_4_EquipoCelularBase {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCosto;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    
    public Problema_4_EquipoCelularBase(String sistemaOperativo, double tamanoPantalla,
                         double costoInicial, double ivaPorcentaje,
                         String direccionMac, String imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.imei = imei;
        calcularCostoFinal();
    }

    private void calcularCostoFinal() {
        ivaCosto = costoInicial * (ivaPorcentaje / 100);
        costoFinal = costoInicial + ivaCosto;
    }

    @Override
    public String toString() {
        return String.format("""
                Sistema Operativo: %s
                Tamaño de Pantalla: %.2f pulgadas
                Costo Inicial: %.2f
                IVA (%.2f%%): %.2f
                Costo Final: %.2f
                Dirección MAC: %s
                IMEI: %s
                """, sistemaOperativo, tamanoPantalla, costoInicial,
                ivaPorcentaje, ivaCosto, costoFinal, direccionMac, imei);
    }
}


