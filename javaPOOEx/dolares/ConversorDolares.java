//Se define la clase
public class ConversorDolares {
    //Esta variable de instancia privada almacena el tipo de cambio actual entre pesos y dólares.
    private double tipoCambio;
    //Esta variable de instancia privada almacena la cantidad de dólares después de la conversión.
    private double dolares;

    //Este es el constructor de la clase. Toma como parámetro el tipo de cambio inicial e inicializa la tipoCambiovariable con este valor.
    public ConversorDolares(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    //Este método obtiene el tipo de cambio actual ( tipoCambio). Devuelve el valor de tipoCambio.
    public double convertirPesosADolares(double cantidadPesos) {
        return cantidadPesos / tipoCambio;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    //Este método es un fijador del tipo de cambio ( tipoCambio). Establece el valor de tipoCambioal valor proporcionado.
    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    //Este método obtiene la cantidad de dólares después de la conversión ( dolares). Devuelve el valor de dolares.
    public double getDolares() {
        return dolares;
    }

/   //Este método establece la cantidad de dólares después de la conversión ( dolares). Establece el valor de dolaresal valor proporcionado.
    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    // Este método imprime el tipo de cambio actual y la cantidad de dólares después de la conversión en la consola.
    public void mostrarDolares() {
        System.out.println("Valor del dolar: " + tipoCambio);
        System.out.println("Pesos convertidos a dólares: " + dolares);
    }

    // Este método anula el toString()método de la Objectclase. Devuelve una representación de cadena del ConversorDolaresobjeto, incluido el tipo de cambio actual ( tipoCambio) y la cantidad de dólares después de la conversión ( dolares).
    @Override
    public String toString() {
        return "ConversorDolares [Valor del dolar=" + tipoCambio + ", dolares=" + dolares + "]";
    }
}

