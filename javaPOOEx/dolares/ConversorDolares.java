public class ConversorDolares {
    private double tipoCambio;
    private double dolares;

    public ConversorDolares(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double convertirPesosADolares(double cantidadPesos) {
        return cantidadPesos / tipoCambio;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public void mostrarDolares() {
        System.out.println("Valor del dolar: " + tipoCambio);
        System.out.println("Pesos convertidos a dólares: " + dolares);
    }

    @Override
    public String toString() {
        return "ConversorDolares [Valor del dolar=" + tipoCambio + ", dolares=" + dolares + "]";
    }
}