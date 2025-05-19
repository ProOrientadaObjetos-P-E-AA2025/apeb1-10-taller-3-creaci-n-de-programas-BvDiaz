package problema5;

import java.util.Random;

public class Problema_5_EstudianteBase {
    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private String estado;

    public Problema_5_EstudianteBase(String nombre) {
        this.nombre = nombre;
        Random rand = new Random();
        this.calificacionMateria1 = rand.nextDouble() * 10;  
        this.calificacionMateria2 = rand.nextDouble() * 10;
        this.calificacionMateria3 = rand.nextDouble() * 10;
        calcularPromedio();
        determinarEstado();
    }

    private void calcularPromedio() {
        promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    private void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nCalificación Materia 1: %.2f\nCalificación Materia 2: %.2f\nCalificación Materia 3: %.2f\nPromedio: %.2f\nEstado: %s",
                             nombre, calificacionMateria1, calificacionMateria2, calificacionMateria3, promedio, estado);
    }
}

