package problema3;
public class Problema_3_InstitucionEducativaBase {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;

    public Problema_3_InstitucionEducativaBase(String nombre, String tipoInstitucion,
                                               int numeroAlumnos, int numeroDocentes,
                                               int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto(); 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
        calcularPresupuesto(); 
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto(); 
    }

    private void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastosProyectadosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s\nTipo de Institución: %s\nNúmero de Alumnos: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\nGasto Proyectado por Estudiante: %.2f\nPresupuesto Total: %.2f",
                nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes,
                gastosProyectadosPorEstudiante, presupuesto);
    }
}
