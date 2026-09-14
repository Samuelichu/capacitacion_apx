package ch01_java_building_blocks.day_six._03_working_with_dates_and_times._01_creating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Local {
    public static void main  (String[] args){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        /*
         * 2026-08-26
         * 00:01:33.167885300
         * 2026-08-26T00:01:33.167885300
         */


        /*
         * CREATE DATES
         * public static LocalDate of(int year, int month, int dayOfMonth)
         * public static LocalDate of(int year, Month month, int dayOfMonth)
         */

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);


        /*
         * CREATE HOURS
         * public static LocalTime of(int hour, int minute)
         * public static LocalTime of(int hour, int minute, int second)
         * public static LocalTime of(int hour, int minute, int second, int nanos)
         */
        LocalTime time1 = LocalTime.of(6, 15); // hora y minutos
        LocalTime time2 = LocalTime.of(6, 15, 30); // + segundos
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanosegundos

        /*
         * CREATE DATETIME
         * public static LocalDateTime of(int year, int month,
            int dayOfMonth, int hour, int minute)

         *  public static LocalDateTime of(int year, int month,
                int dayOfMonth, int hour, int minute, int second)

         *  public static LocalDateTime of(int year, int month,
                int dayOfMonth, int hour, int minute, int second, int nanos)

         *  public static LocalDateTime of(int year, Month month,
                int dayOfMonth, int hour, int minute)

         *  public static LocalDateTime of(int year, Month month,
                int dayOfMonth, int hour, int minute, int second)

         *  public static LocalDateTime of(int year, Month month,
                int dayOfMonth, int hour, int minute, int second, int nanos)

         *  public static LocalDateTime of(LocalDate date, LocalTime)
         */

        // No es correcto trabajar con la creacion del siguiente objeto
        // LocalDate d = new LocalDate();
        LocalDate.of(2015, Month.JANUARY, 32); // Error DateTimeException, 32 no es un dia del mes


    }
}
