package ch01_java_building_blocks.day_three._01_understanding_java_operators._01_working_with_binary_arithmethic_operators._02_numeric_promotion;

public class Numeric {

    public static void main (String[] args){
        int x = 1;
        long y = 33;
        System.out.println(x * y ); // long 33

        double x2 = 39.21;
        //float y2 = 2.1; Por defecto es double
        //System.out.println(x2+y2);

        short x3 = 10;
        short y3  = 3;
        System.out.println(x3 + y3);// int 13

        short x4 = 14;
        float y4 = 13;
        double z4 = 30;
        System.out.println(x4 * y4 / z4); // double 6.066666666666666

    }
}
