import java.util.Scanner;

public class MainCostoAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el costo del vehículo: ");
        double costoVehiculo = scanner.nextDouble();

        CostoAuto auto = new CostoAuto();
        auto.setCostoVehiculo(costoVehiculo);

        double costoFinal = auto.calcularCostoFinal();
        System.out.println("El costo final para el consumidor es: $" + costoFinal);

        System.out.println("Detalles del automóvil:");
        System.out.println(auto.toString());

        scanner.close();
    }
}