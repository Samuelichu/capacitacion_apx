package ch01_java_building_blocks.day_six._03_working_with_dates_and_times._02_manipulating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Manipulating {
    public static void main (String[] args){

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // Output: 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // Output: 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // Output: 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // Output: 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // Output: 2019-02-28


        // Métodos de disminucion

         LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
         LocalTime time = LocalTime.of(5, 15);
         LocalDateTime dateTime = LocalDateTime.of(date1, time);
         System.out.println(dateTime); // Output: 2020-01-20T05:15
         dateTime = dateTime.minusDays(1);
         System.out.println(dateTime); // Output: 2020-01-19T05:15
         dateTime = dateTime.minusHours(10);
         System.out.println(dateTime); // Output: 2020-01-18T19:15
         dateTime = dateTime.minusSeconds(30);
         System.out.println(dateTime); // Output: 2020-01-18T19:14:30

        //Encadenamiento de metodos
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time2 = LocalTime.of(5, 15);

        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2)
                .minusDays(1).minusHours(10).minusSeconds(30);


        LocalDate datez = LocalDate.of(2020, Month.JANUARY, 20);
        datez.plusDays(10); // No lo asignamos a datez, al ser inmutable no cambia
        System.out.println(datez);

        LocalDate datex = LocalDate.of(2020, Month.JANUARY, 20);
        // datex = datex.plusMinutes(1); No compila debido a que LocalDate no contiene una hora

    }
}
