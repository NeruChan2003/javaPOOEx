public class SecondsByDay {
    private int days;

    public SecondsByDay() {
        // Constructor por defecto
    }

    public SecondsByDay(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public long calculateSeconds() {
        return (long) days * 24 * 60 * 60; // Cantidad de segundos en un día
    }

    public String toString() {
        long totalSeconds = calculateSeconds();
        return "SecondsByDay{" + "days=" + days + ", totalSeconds=" + totalSeconds + '}';
    }
}