package ch01_java_building_blocks.day_three._01_understanding_java_operators._03_using_additional_binary_operators._02_casting_primitive_values;

public class Operators {
    int x = (int) 1.0;
    short y = (short) 1921222; // Se guarda como 20678
    int z = (int) 9l;
    long t = 192301398193810323L;

    public void overflowUnderflow (){
        System.out.print(2147483647+1); // -2147483648
    }

    short x1 = 10;
    short y1 = 3;
    // short z1 = x * y; NO COMPILA a pesar de soportar el valor de la operacion

    short x2 = 10;
    short y2 = 3;
    short z2 = (short)(x * y);

    public static void main (String[] args){
        Operators o = new Operators();
        o.overflowUnderflow();
    }
}
