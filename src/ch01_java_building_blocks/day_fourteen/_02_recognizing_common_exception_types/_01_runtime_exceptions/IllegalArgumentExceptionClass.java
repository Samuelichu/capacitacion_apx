package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._01_runtime_exceptions;

public class IllegalArgumentExceptionClass {
    int numberEggs;
    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0)
            this.numberEggs = numberEggs;
    }

    public static void setNumberEggs2(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");
        //this.numberEggs = numberEggs;
    }
    //Exception in thread "main" java.lang.IllegalArgumentException: # eggs must not be negative
    public static void main (String[] args){

    }
}
