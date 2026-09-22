package ch01_java_building_blocks.day_ten._03_inheriting_methods._02_redeclaring_private_methods;

public class BacterianCamel extends Camel {
    // No es sobrescritura, es un nuevo metodo
    private int getNumberOfHumps() {
        return 2;
    }
}
