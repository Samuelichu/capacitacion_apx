package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._09_static_initialization;

public class Static {
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;//Permitido debido a que es incializacion
    }
}
