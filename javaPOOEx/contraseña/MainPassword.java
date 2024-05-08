//Importa la clase Scanner del java.utilpaquete para recibir información del usuario.

import java.util.Scanner;

//Define una clase llamada MainPassword.

public class MainPassword {
    //El método main es el punto de entrada del programa.
    public static void main(String[] args) {

        //Crea un objeto Scanner llamado contrapara leer la entrada del usuario.
        Scanner contra = new Scanner(System.in);

        //Solicita al usuario que ingrese la longitud de las contraseñas y la almacena en la variable longitud.
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = contra.nextInt();

        
       

        //Solicita al usuario que ingrese el tamaño de la matriz de contraseñas y la almacena en la variable tamañoArray.
        System.out.print("Ingrese el tamaño del array de Passwords: ");
        int tamañoArray = contra.nextInt();
        
        //Crea dos matrices: contraseñas(contraseñas) y esFuerteArray(matriz booleana para almacenar si cada contraseña es segura o no).
        Password[] contraseñas = new Password[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        //Genera contraseñas de la longitud especificada y las almacena en la contraseñasmatriz.
        for (int i = 0; i < tamañoArray; i++) {
            contraseñas[i] = new Password(longitud);
            esFuerteArray[i] = contraseñas[i].esFuerte();
        }

        //Comprueba la seguridad de cada contraseña utilizando el esFuertemétodo de la Passwordclase y almacena el resultado en el archivo esFuerteArray.
        System.out.println("Contraseñas generadas y su fortaleza:");
        for (int i = 0; i < tamañoArray; i++) {
            //Imprime cada contraseña generada junto con su seguridad.
            System.out.println(contraseñas[i].toString() + " " + esFuerteArray[i]);
        }

        //Cierra el Scannerobjeto para liberar recursos.
        contra.close();
    }
}



