import java.util.Scanner;

public class MainSecondsByDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días: ");
        int days = scanner.nextInt();

        SecondsByDay secondsByDay = new SecondsByDay();
        secondsByDay.setDays(days);

        long totalSeconds = secondsByDay.calculateSeconds();
        System.out.println("La cantidad de segundos en " + days + " días es: " + totalSeconds + " segundos.");

        System.out.println("Detalles:");
        System.out.println(secondsByDay.toString());

        scanner.close();
    }
}