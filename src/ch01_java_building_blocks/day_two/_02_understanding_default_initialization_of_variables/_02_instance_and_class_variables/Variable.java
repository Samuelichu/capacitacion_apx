package ch01_java_building_blocks.day_two._02_understanding_default_initialization_of_variables._02_instance_and_class_variables;

import ch01_java_building_blocks.day_two._02_understanding_default_initialization_of_variables._01_local_variables.Default;

import java.util.Date;

public class Variable {
    boolean r;
    byte byteVariable;
    char charVariable;
    Date date;

    public static void main (String[] abc){
        Variable v = new Variable();
        System.out.println(v.r);
        System.out.println(v.byteVariable);
        System.out.println(v.charVariable);
        System.out.println(v.date);
    }
}
