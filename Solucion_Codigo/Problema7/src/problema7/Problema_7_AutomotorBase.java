package problema7;
public class Problema_7_AutomotorBase {
    private String cedulaDueno;
    private String marca;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Problema_7_AutomotorBase(String cedulaDueno, String marca, int anoFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marca = marca;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
        calcularValorMatricula();  
    }

    private void calcularValorMatricula() {
        int antiguedad = 2025 - anoFabricacion; 
        valorMatricula = (0.002 / 100) * valorVehiculo * antiguedad;
    }

    @Override
    public String toString() {
        return String.format("Cédula del dueño: %s\nMarca: %s\nAño de fabricación: %d\nValor del vehículo: %.2f\nValor de la matrícula: %.2f",
                             cedulaDueno, marca, anoFabricacion, valorVehiculo, valorMatricula);
    }
}
