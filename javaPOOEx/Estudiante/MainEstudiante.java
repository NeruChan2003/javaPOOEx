import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner gf = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = gf.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = gf.nextInt();
        System.out.print("Ingrese la calificación del estudiante: ");
        double calificacion = gf.nextDouble();

        // Crear un objeto de la clase Estudiante con los datos ingresados por el
        // usuario
        Estudiante estudiante = new Estudiante(nombre, edad, calificacion);

        // Imprimir los detalles del estudiante
        System.out.println(estudiante);

        // Cerrar el Scanner
        gf.close();
    }
}