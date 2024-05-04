import java.util.Scanner;

public class MainConversionTemp {
    public static void main(String[] args) {
        Scanner conver = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsiusInput = conver.nextDouble();

        ConversionTemp temp = new ConversionTemp(celsiusInput);

        temp.mostrarFahrenheit(); // Muestra la temperatura en Celsius y Fahrenheit
        System.out.println(temp.toString()); // Muestra la representación de la temperatura en la clase

        conver.close();
    }
}