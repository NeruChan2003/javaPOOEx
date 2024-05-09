//Se define la clase
public class CostoAuto {
    //Esta variable contiene el costo del vehículo.
    private double costoVehiculo;

    public CostoAuto() {
        // Constructor por defecto
    }

    // Este constructor inicializa la costoVehiculovariable con el costo proporcionado del vehículo.
    public CostoAuto(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    // Este método devuelve el costo del vehículo.
    public double getCostoVehiculo() {
        return costoVehiculo;
    }

    // Este método establece el costo del vehículo al valor proporcionado.
    public void setCostoVehiculo(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    public double calcularCostoFinal() {
        double porcentajeGanancia = 0.12; // 12%
        double impuestos = 0.06; // 6%

         //Este método calcula el costo final del vehículo, que incluye el costo original, la ganancia del vendedor (12% del costo original) y los impuestos aplicables (6% del costo original). Devuelve el coste final calculado.
        double gananciaVendedor = costoVehiculo * porcentajeGanancia;
        double impuestosAplicables = costoVehiculo * impuestos;

        double costoFinal = costoVehiculo + gananciaVendedor + impuestosAplicables;
        return costoFinal;
    }

    @Override
    // Este método anula el toString()método de la Objectclase. 
    public String toString() {
        //Calcula el costo final utilizando el calcularCostoFinal()método 
        double costoFinal = calcularCostoFinal();
        //Devuelve una representación de cadena del CostoAutoobjeto, incluido el costo original y el costo final.
        return "CostoAuto{" + "costoVehiculo=" + costoVehiculo + ", costoFinal=" + costoFinal + '}';
    }
}

.







