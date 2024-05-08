//La clase Scanner le permite leer entradas de varias fuentes, como el teclado.
import java.util.Scanner;

//Esta línea define una clase pública llamada MainGasolinera
public class MainGasolinera {
    //Esta línea define el método main, que sirve como punto de entrada del programa. Acepta una matriz de cadenas ( args) como parámetros.
    public static void main(String[] args) {
        //Esta línea crea un nuevo Scannerobjeto llamado gasopara leer la entrada del flujo de entrada estándar ( System.in). 
        Scanner gaso = new Scanner(System.in);

        //Gasolinera gasolinera = new Gasolinera();-Esta línea crea una nueva instancia de la clase Gasolinera y la asigna a la variable gasolinera. 
        Gasolinera gasolinera = new Gasolinera();

        //Esta línea imprime un mensaje pidiendo al usuario que ingrese el precio de la gasolina por litro.
        System.out.print("Ingrese el precio de la gasolina por litro: ");
        //Esta línea lee un valor doble ingresado por el usuario usando el nextDouble()método del Scannerobjeto gaso y lo asigna a la variable precioPorLitro.
        double precioPorLitro = gaso.nextDouble();
        //gasolinera.setPrecioPorLitro(precioPorLitro);- Esta línea llama al setPrecioPorLitro()método del gasolineraobjeto, pasando precioPorLitrocomo argumento. 
        gasolinera.setPrecioPorLitro(precioPorLitro);

        //Esta línea imprime un mensaje solicitando al usuario que ingrese la cantidad de galones suministrados.
        System.out.print("Ingrese la cantidad de galones surtidos: ");
       //Esta línea lee un valor doble ingresado por el usuario usando el nextDouble()método del Scanner objeto gaso y lo asigna a la variable galonesSurtidos.
        double galonesSurtidos = gaso.nextDouble();

        //Esta línea llama al calcularMonto()método del gasolineraobjeto, pasándolo galonesSurtidoscomo argumento. Presumiblemente, este método calcula la cantidad a cobrar en función de la cantidad de galones suministrados.
        double montoACobrar = gasolinera.calcularMonto(galonesSurtidos);
        // Esta línea imprime el monto calculado a cobrar al usuario.
        System.out.println("El monto a cobrar es: $" + montoACobrar);

        //Esta línea imprime un mensaje indicando que a continuación se mostrarán los detalles de la gasolinera.
        System.out.println("Detalles de la gasolinera:");
        //Esta línea llama al toString()método del gasolineraobjeto, que presumiblemente devuelve una representación de cadena de los detalles de la gasolinera y la imprime.
        System.out.println(gasolinera.toString());

        //Esta línea cierra el Scannerobjeto gasopara liberar los recursos del sistema asociados a él, ya que ya no es necesario.
        gaso.close();
    }
}
