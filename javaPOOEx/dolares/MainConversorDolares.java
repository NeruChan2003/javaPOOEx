//Esta declaración importa la Scannerclase del java.utilpaquete, lo que permite que el programa lea la entrada del usuario desde el flujo de entrada estándar.
import java.util.Scanner;
//Se define la clase
public class MainConversorDolares {
    //Se define la clase main.
    public static void main(String[] args) {
        //Esta línea crea un Scannerobjeto llamado di, que permite al programa leer la entrada del usuario desde la consola.
        Scanner di = new Scanner(System.in);

        // Esta línea solicita al usuario que ingrese el tipo de cambio actual (valor de un dólar).
        System.out.print("Ingrese el valor del dólar: ");
        //Esta línea lee el valor de entrada del dólar ingresado por el usuario y lo almacena en la variable tipoCambio.
        double tipoCambio = di.nextDouble();

        //Esta línea crea una nueva instancia de la ConversorDolaresclase con el tipo de cambio proporcionado.
        ConversorDolares conversor = new ConversorDolares(tipoCambio);

        //Esta línea solicita al usuario que ingrese la cantidad de pesos para convertir a dólares.
        System.out.print("Ingrese la cantidad de pesos a convertir a dólares: ");
        //Esta línea lee la cantidad de pesos ingresada por el usuario y la almacena en la variable cantidadPesos.
        double cantidadPesos = di.nextDouble();

        //Esta línea convierte la cantidad de pesos a dólares usando el convertirPesosADolaresmétodo de la ConversorDolaresclase y establece la cantidad convertida de dólares en el ConversorDolaresobjeto.
        conversor.setDolares(conversor.convertirPesosADolares(cantidadPesos)); 

        //Esta línea muestra el monto convertido en pesos y dólares llamando al mostrarDolaresmétodo del ConversorDolaresobjeto.
        conversor.mostrarDolares(); // Muestra la cantidad en pesos y dólares


        System.out.println(conversor.toString()); // Imprime la representación en cadena del objeto conversor

        //Esta línea cierra el Scannerobjeto para liberar recursos del sistema cuando ya no sea necesario.
        di.close();
    }
}



