package ch01_java_building_blocks.day_eight._05_overloading_methods._01_overloading_and_varargs;

import ch01_java_building_blocks.day_eight._05_overloading_methods.Overloading;


public class OverloadingVarargs {
    public static void main (String[] args){
        OverloadingVarargs o = new OverloadingVarargs();
        o.fly(new int[] { 1, 2, 3 });
    }

    public void fly(int[] lengths) { }

    // public void fly(int... lengths) { } Mismos parametros para java
}
