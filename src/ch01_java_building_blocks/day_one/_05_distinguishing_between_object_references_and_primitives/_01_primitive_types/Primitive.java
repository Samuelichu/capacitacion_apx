package ch01_java_building_blocks.day_one._05_distinguishing_between_object_references_and_primitives._01_primitive_types;

public class Primitive {
    public static void main(String[] args){
        boolean tr = true;
        byte a = 10;
        short b = 1000;
        int c = 100000;
        long d = 3123456789L;
        float e = 10.5f;
        double f = 10.5;
        char name = 's';

        //long max = 3123456789;
        long max2 = 3123456789L;
        System.out.println(Integer.MAX_VALUE);

        int numberO = 017; // Octal
        int numberH = 0xFF; // Hexadecimal
        int numberB = 0b10; // Binario
        System.out.println(numberB);


        int million1 = 1000000;
        int million2 = 1_000_000; // mejor lectura

       /* Casos donde se presenta error
        double notAtStart = _1000.00;
        double notAtEnd = 1000.00_;
        double notByDecimal = 1000_.00;
        */
        double annoyingButLegal = 1_00_0.0_0;

    }
}
