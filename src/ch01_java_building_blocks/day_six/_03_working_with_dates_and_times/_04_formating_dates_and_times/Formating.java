package ch01_java_building_blocks.day_six._03_working_with_dates_and_times._04_formating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formating {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);

        System.out.println(date.getDayOfWeek());   // Output: MONDAY
        System.out.println(date.getMonth());       // Output: JANUARY
        System.out.println(date.getYear());        // Output: 2020
        System.out.println(date.getDayOfYear());   // Output: 20

        //Formato de fechas
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);

        // package: java.time.format
        System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE)); // Output: 2020-01-20

        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); // Output: 11:12:34

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // Output: 2020-01-20T11:12:34


        // Formato corto
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(dateTime)); // Output: 1/20/20
        System.out.println(shortDateTime.format(date));     // Output: 1/20/20
        System.out.println(shortDateTime.format(time)); // Error UnsupportedTemporalTypeException
        // Ambas actuan igual
        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime2));
        System.out.println(date.format(shortDateTime2));
        System.out.println(time.format(shortDateTime2));

        //Formatos predifinidos
        LocalDate dateD = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime timeD = LocalTime.of(11, 12, 34);
        LocalDateTime dateTimeD = LocalDateTime.of(dateD, timeD);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortF.format(dateTimeD));  // Output: 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTimeD)); // Output: Jan 20, 2020 11:12:34 AM

        // formato definido por nosotros
        DateTimeFormatter nn = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTimeD.format(nn));


        // repaso
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime);
        f.format(date); // falla
        f.format(time);
    }
}
