public class AreaTriangulo {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Métodos getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área del triángulo de forma recursiva
    public double calcularArea() {
        return calcularAreaRecursivo(base, altura);
    }

    private double calcularAreaRecursivo(double base, double altura) {
        // Caso base: cuando la altura es 0, el área es 0
        if (altura == 0) {
            return 0;
        }
        // Llamada recursiva reduciendo la altura en 1 unidad
        return base + calcularAreaRecursivo(base, altura - 1);
    }

    // Método toString para imprimir los atributos y el área
    @Override
    public String toString() {
        double area = calcularArea(); // Calcular el área
        return "Triángulo: [Base=" + base + ", Altura=" + altura + ", Área=" + area + "]";
    }
}