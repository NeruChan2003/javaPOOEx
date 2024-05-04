import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner contra = new Scanner(System.in);

        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = contra.nextInt();

        System.out.print("Ingrese el tamaño del array de Passwords: ");
        int tamañoArray = contra.nextInt();

        Password[] contraseñas = new Password[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            contraseñas[i] = new Password(longitud);
            esFuerteArray[i] = contraseñas[i].esFuerte();
        }

        System.out.println("Contraseñas generadas y su fortaleza:");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(contraseñas[i].toString() + " " + esFuerteArray[i]);
        }

        contra.close();
    }
}