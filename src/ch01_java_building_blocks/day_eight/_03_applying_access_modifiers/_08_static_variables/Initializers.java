package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._08_static_variables;

import java.util.ArrayList;

public class Initializers {
    private static int counter = 0; // inicialización

    private static final int NUM_BUCKETS = 45;

    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
       // NUM_BUCKETS = 5; No podemos alterar una constante

        values.add("changed"); // permitido ya que solo modificamos el contenido del objeto
    }
}
