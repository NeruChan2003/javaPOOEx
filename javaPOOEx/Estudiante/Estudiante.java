public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        if (edad < 0) {
            System.out.println("Edad inválida. Se establecerá a 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
        if (calificacion < 0) {
            System.out.println("Calificación inválida. Se establecerá a 0.");
            this.calificacion = 0;
        } else {
            this.calificacion = calificacion;
        }
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Edad inválida. Se establecerá a 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) {
            System.out.println("Calificación inválida. Se establecerá a 0.");
            this.calificacion = 0;
        } else {
            this.calificacion = calificacion;
        }
    }

    // Método para imprimir los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante: [Nombre=" + nombre + ", Edad=" + edad + ", Calificación=" + calificacion + "]";
    }
}