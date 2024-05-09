
//Se importa el scanner
import java.util.Scanner;

//Se define la clase
public class MainSecondsByDay {
    // Se define el metodo main
    public static void main(String[] args) {
        // Se crea una nueva instancia de la clase Scanner que se utiliza para leer la
        // entrada del usuario desde la consola.
        Scanner seg = new Scanner(System.in);

        // Se muestra un mensaje en la consola solicitando al usuario que ingrese la
        // cantidad de días.
        System.out.print("Ingrese la cantidad de días: ");
        // Se lee un número entero ingresado por el usuario utilizando el método
        // nextInt() del objeto Scanner recién creado. El valor ingresado se almacena en
        // la variable days.
        int days = seg.nextInt();

        // Se crea un nuevo objeto de la clase SecondsByDay utilizando el constructor
        // por defecto. Este objeto representará una cantidad de días, pero inicialmente
        // no tiene ningún valor asignado.
        SecondsByDay secondsByDay = new SecondsByDay();
        // Se utiliza el método setDays(int days) para establecer el número de días
        // ingresado por el usuario en el objeto secondsByDay. De esta manera, se
        // actualiza el estado del objeto con la cantidad de días proporcionada por el
        // usuario.
        secondsByDay.setDays(days);

        // Se llama al método calculateSeconds() del objeto secondsByDay para calcular
        // el total de segundos basado en la cantidad de días que se estableció
        // anteriormente. El resultado se almacena en la variable totalSeconds.
        long totalSeconds = secondsByDay.calculateSeconds();
        // Se imprime en la consola un mensaje que indica la cantidad de días ingresados
        // por el usuario y la cantidad total de segundos calculada.
        System.out.println("La cantidad de segundos en " + days + " días es: " + totalSeconds + " segundos.");

        // Se imprime en la consola un mensaje que indica que se mostrarán los detalles
        // del objeto secondsByDay.
        System.out.println("Detalles:");
        // Se llama al método toString() del objeto secondsByDay, que devuelve una
        // representación en cadena de caracteres de los detalles del objeto. Esto
        // incluye el número de días y el total de segundos calculados.
        System.out.println(secondsByDay.toString());

        // Se cierra el objeto Scanner para liberar los recursos asociados con la
        // entrada del usuario.
        seg.close();
    }
}





