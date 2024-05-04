public class CostoAuto {
    private double costoVehiculo;

    public CostoAuto() {
        // Constructor por defecto
    }

    public CostoAuto(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    public double getCostoVehiculo() {
        return costoVehiculo;
    }

    public void setCostoVehiculo(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    public double calcularCostoFinal() {
        double porcentajeGanancia = 0.12; // 12%
        double impuestos = 0.06; // 6%

        double gananciaVendedor = costoVehiculo * porcentajeGanancia;
        double impuestosAplicables = costoVehiculo * impuestos;

        double costoFinal = costoVehiculo + gananciaVendedor + impuestosAplicables;
        return costoFinal;
    }

    @Override
    public String toString() {
        double costoFinal = calcularCostoFinal();
        return "CostoAuto{" + "costoVehiculo=" + costoVehiculo + ", costoFinal=" + costoFinal + '}';
    }
}