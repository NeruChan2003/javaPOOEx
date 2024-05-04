import java.util.Scanner;

public class MainConversorDolares {
    public static void main(String[] args) {
        Scanner di = new Scanner(System.in);

        System.out.print("Ingrese el valor del dólar: ");
        double tipoCambio = di.nextDouble();

        ConversorDolares conversor = new ConversorDolares(tipoCambio);

        System.out.print("Ingrese la cantidad de pesos a convertir a dólares: ");
        double cantidadPesos = di.nextDouble();

        conversor.setDolares(conversor.convertirPesosADolares(cantidadPesos)); // Se establecen los dólares en el
                                                                               // conversor

        conversor.mostrarDolares(); // Muestra la cantidad en pesos y dólares

        System.out.println(conversor.toString()); // Imprime la representación en cadena del objeto conversor

        di.close();
    }
}