package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._03_erros;

public class ExceptionInInitializerErrorClass {
    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static void main(String[] args) { }
    // Exception in thread "main" java.lang.ExceptionInInitializerError
    //Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
}
