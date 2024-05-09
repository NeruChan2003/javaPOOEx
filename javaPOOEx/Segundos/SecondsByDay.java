//Se define la clase
public class SecondsByDay {
    //tiene un atributo privado daysque almacena el número de días.
    private int days;

    public SecondsByDay() {
        // Constructor por defecto
    }

    //Un constructor que toma un parámetro daysy lo usa para inicializar el atributo days.
    public SecondsByDay(int days) {
        this.days = days;
    }

    //son métodos de acceso que permiten obtener y establecer el valor del atributo days, respectivamente.
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //calcula el número total de segundos multiplicando el número de días por la cantidad de segundos en un día (24 horas * 60 minutos * 60 segundos) y devuelve el resultado como un valor long.
    public long calculateSeconds() {
        return (long) days * 24 * 60 * 60; // Cantidad de segundos en un día
    }

    //El método toString()está escrito para proporcionar una representación en forma de cadena del objeto SecondsByDay. 
    public String toString() {
        //Calcula el número total de segundos utilizando el método calculateSeconds
        long totalSeconds = calculateSeconds();
        //devuelve una cadena que incluye el número de días y el total de segundos.
        return "SecondsByDay{" + "days=" + days + ", totalSeconds=" + totalSeconds + '}';
    }
}
