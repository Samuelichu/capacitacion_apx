package ch01_java_building_blocks.day_fourteen._02_recognizing_common_exception_types._01_runtime_exceptions;

public class ArrayIndexOutOfBoundsExceptionClass {
    public static void main (String[] args){
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3

        int total = 0;
        int[] countsOfMoose2 = new int[3];

        for (int i = 0; i <= countsOfMoose2.length; i++)
            total += countsOfMoose2[i];

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
    }


}
