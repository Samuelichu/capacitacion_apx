package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._01_runtime_exceptions;

public class NumberFormatExceptionClass {
    public static void main (String[] args){
       int number = Integer.parseInt("abc");
        System.out.println(number);
        //thread "main" java.lang.NumberFormatException: For input string: "abc"
    }
}
