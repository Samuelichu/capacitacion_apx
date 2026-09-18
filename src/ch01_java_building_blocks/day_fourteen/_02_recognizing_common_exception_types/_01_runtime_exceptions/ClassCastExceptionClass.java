package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._01_runtime_exceptions;

public class ClassCastExceptionClass {
    public static void main (String[] args){
        String type = "moose";
        //Integer number = (Integer) type;
        //java: incompatible types: java.lang.String cannot be converted to java.lang.Integer

        String type2 = "moose";
        Object obj = type2;
        Integer number = (Integer) obj;
        // class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
    }
}
