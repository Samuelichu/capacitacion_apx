package ch01_java_building_blocks.day_six._02_understanding_an_array_List._02_wrapper_classes;

public class Wrapper {
    int primitive = Integer.parseInt("123"); // Convierte a int
    Integer wrapper = Integer.valueOf("123"); // Wrapper class Integer

    int bad1 = Integer.parseInt("a"); // Error NumberFormatException
    Integer bad2 = Integer.valueOf("123.45"); // Error NumberFormatException
}
