//Se define la clase
public class ConversionTemp {
    //Un atributo privado que almacena la temperatura en grados Celsius.
    private double celsius;
    //Un atributo privado que almacena la temperatura en grados Fahrenheit.
    private double fahrenheit;

    //Un método público que devuelve la temperatura en grados Celsius.
    public ConversionTemp(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    // Un método público que establece la temperatura en grados Celsius.
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Un método público que devuelve la temperatura en grados Fahrenheit.
    public double getFahrenheit() {
        return fahrenheit;
    }

    //Un método público que establece la temperatura en grados Fahrenheit.
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    //Un método público que convierte la temperatura de grados Celsius a grados Fahrenheit utilizando la fórmula de conversión.
    public double convertToFahrenheit() {
        return (9 * celsius + 160) / 5;
    }

    //método público que calcula la temperatura en grados Fahrenheit llamando a convertToFahrenheit()y luego muestra ambos valores de temperatura en la consola.
    public void mostrarFahrenheit() {
        fahrenheit = convertToFahrenheit();
        System.out.println("Grados en Celsius: " + celsius);
        System.out.println("Grados en Fahrenheit: " + fahrenheit);
    }

    @Override
    //devuelve una representación en cadena de caracteres de los detalles del objeto. Esto incluye el número de días y el total de segundos calculados.
    public String toString() {
        return "ConversionTemp [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
    }
}







