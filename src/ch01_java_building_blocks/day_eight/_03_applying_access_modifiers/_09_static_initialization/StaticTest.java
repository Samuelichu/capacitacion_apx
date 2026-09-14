package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._09_static_initialization;

public class StaticTest {
    private static int one;
    private static final int two;
    private static final int three = 3;
   // private static final int four; Nunca se inicializa

    static {
        one = 1;
        two = 2;
        //three = 3; ya se le asigno un valor
        //two = 4; ya se le dio un valor
    }
}
