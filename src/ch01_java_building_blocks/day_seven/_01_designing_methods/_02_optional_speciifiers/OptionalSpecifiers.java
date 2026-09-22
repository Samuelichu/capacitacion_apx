package ch01_java_building_blocks.day_seven._01_designing_methods._02_optional_speciifiers;

public class OptionalSpecifiers {
    public void walk1(){}
    public final void walk2(){}
    public static final void walk3(){}
    public final static void walk4(){}
    //public modifier void walk5(){} modifier no es un especificador opcional
    // public void final walk6(){} especificador opcional no debe ir despues del tipo de retorno
    final public void walk7(){}
}
