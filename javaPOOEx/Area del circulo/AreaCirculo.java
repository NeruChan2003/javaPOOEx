public class AreaCirculo {
    private double radio;

    public AreaCirculo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return calcularAreaRecursiva(radio);
    }

    private double calcularAreaRecursiva(double radio) {
        if (radio <= 0) {
            return 0;
        }
        return Math.PI * Math.pow(radio, 2) + calcularAreaRecursiva(radio - 1);
    }

    @Override
    public String toString() {
        double area = calcularArea();
        return "AreaCirculo{" + "radio=" + radio + ", area=" + area + '}';
    }
}