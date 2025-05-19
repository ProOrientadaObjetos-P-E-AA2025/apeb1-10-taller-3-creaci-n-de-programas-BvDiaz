package ejecutor;

import java.util.Random;

public class Problema_1_TerrenoEjecutor {
    public static void main(String[] args) {
        Problema_1_TerrenoBase terreno = new Problema_1_TerrenoBase();

        Random random = new Random();
        double ancho = 5 + (15 - 5) * random.nextDouble(); 
        double largo = 10 + (25 - 10) * random.nextDouble(); 
        double valorMetroCuadrado = 50 + (200 - 50) * random.nextDouble(); 

        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setValorMetroCuadrado(valorMetroCuadrado);

        terreno.calcularArea();
        terreno.calcularCostoTerreno();

        System.out.println(terreno);
    }
    
}
