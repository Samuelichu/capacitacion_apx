package ch01_java_building_blocks.day_two._01_declaring_and_initializing_variables._01_declaring_multiple_variables;

public class MultipleVariables {
    //String s1, s2;
    //String s3="yes", s4 = "no"; 4 declaradas, 2 inicializadas

    //int i1, i2, i3=0; 3 declaradas, 1 inicializada

    // int num, String value; NO COMPILA

    boolean b1, b2; // 2 declaradas
    String s1 = "1", s2; // 2 declaradas, 1 inicializada
    //double d1, double d2; NO COMPILA a pesar de ser del mismo tipo
    int i1; int i2;
    int i3;
    //i4; NO COMPILA


    public static void main(String... args){
        MultipleVariables nr = new MultipleVariables();
        System.out.println(nr.s1);
    }
}
