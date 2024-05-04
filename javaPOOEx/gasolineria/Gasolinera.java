public class Gasolinera {
    private double precioPorLitro; // Precio de la gasolina por litro

    public Gasolinera() {
        // Constructor default
        precioPorLitro = 0; // Inicializamos el precio por litro a cero
    }

    public double getPrecioPorLitro() {
        return precioPorLitro;
    }

    public void setPrecioPorLitro(double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    public double calcularMonto(double galonesSurtidos) {
        // Convertimos los galones a litros
        double litrosSurtidos = galonesSurtidos * 3.78541;
        // Calculamos el monto a cobrar
        double monto = litrosSurtidos * precioPorLitro;
        return monto;
    }

    @Override
    public String toString() {
        // Calculamos el monto con un valor arbitrario de galones (por ejemplo, 10)
        double monto = calcularMonto(10);
        return "Gasolinera [precioPorLitro=" + precioPorLitro + ", montoACobrar=" + monto + "]";
    }
}