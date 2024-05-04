public class ConversionTemp {
    private double celsius;
    private double fahrenheit;

    public ConversionTemp(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double convertToFahrenheit() {
        return (9 * celsius + 160) / 5;
    }

    public void mostrarFahrenheit() {
        fahrenheit = convertToFahrenheit();
        System.out.println("Grados en Celsius: " + celsius);
        System.out.println("Grados en Fahrenheit: " + fahrenheit);
    }

    @Override
    public String toString() {
        return "ConversionTemp [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
    }
}