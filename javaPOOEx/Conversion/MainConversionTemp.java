//Se importa la libreria Scanner
import java.util.Scanner;
//Se define la clase
public class MainConversionTemp {
    //Se llama al metodo main
    public static void main(String[] args) {
        //Se crea un nuevo objeto Scannerpara leer la entrada del usuario desde la consola.
        Scanner conver = new Scanner(System.in);

        // Se muestra un mensaje en la consola solicitando al usuario que ingrese la temperatura en grados Celsius.
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        //Se lee un número de tipo doubleingresado por el usuario utilizando el método nextDouble()del objeto Scanner. El valor ingresado se almacena en la variable celsiusInput.
        double celsiusInput = conver.nextDouble();

        // Se crea un nuevo objeto de la clase ConversionTemputilizando el constructor que toma la temperatura en grados Celsius como argumento. Este objeto representará la temperatura ingresada por el usuario.
        ConversionTemp temp = new ConversionTemp(celsiusInput);

        //Se llama al método mostrarFahrenheit()del objeto temp, que muestra la temperatura en grados Celsius y Fahrenheit en la consola.
        temp.mostrarFahrenheit(); // Muestra la temperatura en Celsius y Fahrenheit
        // Se imprime en la consola la representación de la temperatura en forma de cadena de caracteres utilizando el método toString()del objeto temp.
        System.out.println(temp.toString()); // Muestra la representación de la temperatura en la clase

         //Se cierra el objeto Scannerpara liberar los recursos asociados con la entrada del usuario.
        conver.close();
    }
}
