import java.time.*;
public class DateLapse implements IDateLapse {

    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from,LocalDate to) {
        this.from=from;
        this.to=to;
    }


    public LocalDate getFrom() {
        return this.from;
    }

    public LocalDate getTo() {
        return this.to;
    }

    public int sizeInDays() {
        return this.getFrom().until(this.getTo()).getDays();
    }

    public boolean includesDate(LocalDate other) {
        if (other.equals(this.to) || other.equals(this.from) || other.isAfter(this.getFrom()) && other.isBefore(this.getTo())) {
            return true;
        }
        return false;
    }

    public boolean overlaps (IDateLapse anotherDateLapse){
        if (  ( (anotherDateLapse.getFrom().isAfter(this.getFrom())) && (anotherDateLapse.getFrom().isBefore(this.getTo()))    )    ||
                (  (anotherDateLapse.getTo().isAfter(this.getFrom()))  && (anotherDateLapse.getTo().isBefore(this.getTo()))  )  ){
                return true;
        }
        else {
            return false;
        }
    }



}
