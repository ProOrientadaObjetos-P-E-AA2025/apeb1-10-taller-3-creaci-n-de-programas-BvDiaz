package ejecutor;
public class Problema_1_TerrenoBase {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costoTerreno = valorMetroCuadrado * area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    @Override
    public String toString() {
        return "Terreno{\n" +
                "ancho = " + ancho + "\n" + 
                ", largo = " + largo + "\n" +
                ", area = " + area + "\n" +
                ", valorMetroCuadrado = " + valorMetroCuadrado + "\n" +
                ", costoTerreno = " + costoTerreno + "\n" +
                '}';
    }
}
