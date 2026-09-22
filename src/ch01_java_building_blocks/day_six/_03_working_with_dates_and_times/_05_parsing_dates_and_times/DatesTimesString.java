package ch01_java_building_blocks.day_six._03_working_with_dates_and_times._05_parsing_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesTimesString {
    public static void main (String[] args){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");

        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");

        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
    }
}
