import java.util.Scanner;

public class MainGasolinera {
    public static void main(String[] args) {
        Scanner gaso = new Scanner(System.in);

        Gasolinera gasolinera = new Gasolinera();

        System.out.print("Ingrese el precio de la gasolina por litro: ");
        double precioPorLitro = gaso.nextDouble();
        gasolinera.setPrecioPorLitro(precioPorLitro);

        System.out.print("Ingrese la cantidad de galones surtidos: ");
        double galonesSurtidos = gaso.nextDouble();

        double montoACobrar = gasolinera.calcularMonto(galonesSurtidos);
        System.out.println("El monto a cobrar es: $" + montoACobrar);

        System.out.println("Detalles de la gasolinera:");
        System.out.println(gasolinera.toString());

        gaso.close();
    }
}
