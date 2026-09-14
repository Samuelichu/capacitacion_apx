package ch01_java_building_blocks.day_six._03_working_with_dates_and_times._03_working_with_periods;

import java.time.*;

public class Periods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        Period period = Period.ofMonths(1);
        //performAnimalEnrichmentStatic(start, end);
        performAnimalEnrichment(start, end, period);

        // Podemos cambiar el periodo
        Period.ofMonths(3);  // cada 3 meses
        Period.ofYears(1);   // cada año
        Period everyThreeWeeks = Period.ofWeeks(3); // cada 3 semanas
        Period everyOtherDay = Period.ofDays(2); // cada 2 días
        Period everyYearAndAWeek = Period.of(1, 0, 7); // cada año y 7 días

        // No es posible encadenar métodos
        Period wrong = Period.ofYears(1).ofWeeks(1);
        //Son lo mismo
        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(7);
    }

    // No reutilizable, periodo de tiempo fijo
    private static void performAnimalEnrichmentStatic(LocalDate start, LocalDate end) {
        LocalDate upTo = start;

        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // utilizo el período genérico

        LocalDate upTo = start;

        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // agrego el periodo
        }
    }

    public void period (){
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);

        System.out.println(date.plus(period));      // Output: 2015-02-20
        System.out.println(dateTime.plus(period));  // Output: 2015-02-20T06:15
        System.out.println(time.plus(period));      // Error UnsupportedTemporalTypeException
    }
}
