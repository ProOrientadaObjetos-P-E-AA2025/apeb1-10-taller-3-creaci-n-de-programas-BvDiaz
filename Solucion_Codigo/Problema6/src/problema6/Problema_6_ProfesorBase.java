package problema6;
public class Problema_6_ProfesorBase {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Problema_6_ProfesorBase(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        calcularSueldoTotal();  
    }

    private void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s %s\nSueldo Básico: %.2f\nSueldo Total: %.2f\nCédula: %s",
                             nombre, apellido, sueldoBasico, sueldoTotal, cedula);
    }
}
