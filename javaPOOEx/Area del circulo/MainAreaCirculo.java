import java.util.Scanner;

public class MainAreaCirculo {
    public static void main(String[] args) {
        Scanner are = new Scanner(System.in);

        double radio;
        do {
            System.out.print("Ingrese el radio del círculo (debe ser mayor que 0): ");
            radio = are.nextDouble();
        } while (radio <= 0);

        double area = calcularAreaRecursiva(radio);
        System.out.println("El área del círculo es: " + area);

        // Imprimir los detalles del círculo utilizando el método toString
        System.out.println(toString(radio, area));

        are.close();
    }

    public static double calcularAreaRecursiva(double radio) {
        // Caso base: si el radio es menor o igual a 0, el área es 0
        if (radio <= 0) {
            return 0;
        }

        // Cálculo del área para el radio actual
        double areaActual = Math.PI * Math.pow(radio, 2);

        // Llamada recursiva con un radio más pequeño
        return areaActual + calcularAreaRecursiva(radio - 1);
    }

    public static String toString(double radio, double area) {
        return "Radio del círculo: " + radio + ", Área del círculo: " + area;
    }
}