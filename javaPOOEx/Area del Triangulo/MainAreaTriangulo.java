import java.util.Scanner;

public class MainAreaTriangulo {
    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = go.nextDouble();

        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = go.nextDouble();

        // Crear un objeto de la clase AreaTriangulo con los datos ingresados por el
        // usuario
        AreaTriangulo triangulo = new AreaTriangulo(base, altura);

        // Imprimir los detalles del triángulo usando toString
        System.out.println(triangulo);

        // Calcular y mostrar el área del triángulo
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        // Cerrar el Scanner
        go.close();
    }
}