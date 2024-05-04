import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    // Constructor por defecto
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // Constructor con longitud personalizada
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Verifica si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    // Genera una contraseña aleatoria
    public void generarPassword() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = random.nextInt(3); // 0: mayúscula, 1: minúscula, 2: número
            char caracter;
            switch (tipoCaracter) {
                case 0:
                    caracter = (char) (random.nextInt(26) + 'A');
                    break;
                case 1:
                    caracter = (char) (random.nextInt(26) + 'a');
                    break;
                case 2:
                    caracter = (char) (random.nextInt(10) + '0');
                    break;
                default:
                    caracter = ' '; // Esto no debería ocurrir
            }
            sb.append(caracter);
        }

        contraseña = sb.toString();
    }

    // Método toString para imprimir detalles del objeto
    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contraseña='" + contraseña + '\'' + '}';
    }

    // Getters y setters
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword(); // Generar nueva contraseña con la longitud actualizada
    }
}