package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._03_erros;

public class StackOverflowErrorClass {
    public static void doNotCodeThis(int num) {
        doNotCodeThis(1); // se llama a si mismo
    }

    //Exception in thread "main" java.lang.StackOverflowError
}
