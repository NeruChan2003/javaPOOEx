
//Esta declaración importa la Scannerclase del java.utilpaquete, lo que permite al programa leer la entrada del flujo de entrada estándar.
import java.util.Scanner;

//Se define la clase
public class MainCostoAuto {
    // Se define la clase main
    public static void main(String[] args) {
        // Esta línea crea un Scannerobjeto llamado scanner, que permite al programa
        // leer la entrada del usuario desde la consola.
        Scanner au = new Scanner(System.in);

        // Esta línea solicita al usuario que ingrese el costo del vehículo.
        System.out.print("Ingrese el costo del vehículo: ");
        double costoVehiculo = au.nextDouble();

        // Esta línea lee el costo de entrada del vehículo proporcionado por el usuario
        // y lo almacena en la variable costoVehiculo.
        CostoAuto auto = new CostoAuto();
        // Esta línea crea una nueva instancia de `CostoAuto
        auto.setCostoVehiculo(costoVehiculo);

        double costoFinal = auto.calcularCostoFinal();
        System.out.println("El costo final para el consumidor es: $" + costoFinal);
        // Imprime un mensaje en pantalla
        System.out.println("Detalles del automóvil:");
        // Imprime el costo del vehiculo.
        System.out.println(auto.toString());

        au.close();
    }
}
