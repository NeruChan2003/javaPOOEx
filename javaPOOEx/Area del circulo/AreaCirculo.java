//Se define la clase
public class AreaCirculo {
     //Un atributo privado que almacena la radio del círcul
    private double radio;
    //Constructor
    public AreaCirculo(double radio) {
        this.radio = radio;
    }
    //Un método público que devuelve la radio del círculo.
    public double getRadio() {
        return radio;
    }

    //Un método público que establece la radio del círculo.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return calcularAreaRecursiva(radio);
    }

    //método privado que calcula el área del círculo utilizando la fórmula π * r^2. Esteradiohasta 1. Cuando radioes menor o igual a 0, devuelve 0.
    private double calcularAreaRecursiva(double radio) {
        if (radio <= 0) {
            return 0;
        }
        return Math.PI * Math.pow(radio, 2) + calcularAreaRecursiva(radio - 1);
    }

    //Un método sobrescrito que devuelve una representación en cadena de caracteres del objeto AreaCirculo,
    @Override
    public String toString() {
        double area = calcularArea();
        return "AreaCirculo{" + "radio=" + radio + ", area=" + area + '}';
    }
}




