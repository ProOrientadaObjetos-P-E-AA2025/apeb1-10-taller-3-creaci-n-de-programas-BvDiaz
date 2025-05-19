package problema2;
public class Problema_2_EquivalenteHoraBase {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public Problema_2_EquivalenteHoraBase(double horas) {
        this.horas = horas;
        calcularEquivalentes();
    }

    // Método para calcular equivalentes
    private void calcularEquivalentes() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("Horas: %.2f\nMinutos: %.2f\nSegundos: %.2f\nDías: %.4f",
                horas, minutos, segundos, dias);
    }
}

