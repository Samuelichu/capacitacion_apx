package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._01_runtime_exceptions;

public class NullPointerExceptionClass {
    String name;

    public void printLength() throws NullPointerException {
        System.out.println(name.length());
    }
    //Exception in thread "main" java.lang.NullPointerException
}
