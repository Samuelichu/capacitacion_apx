package ch01_java_building_blocks.day_nine._03_writing_simple_lambdas._01_lambda_syntax;

import ch01_java_building_blocks.day_nine._03_writing_simple_lambdas.Animal;
import ch01_java_building_blocks.day_nine._03_writing_simple_lambdas.CheckIfHopper;
import ch01_java_building_blocks.day_nine._03_writing_simple_lambdas.CheckTrait;

import java.util.ArrayList;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        /*
             lambdas validos
                print(() -> true); // 0 parámetros
                print(a -> a.startsWith("test")); // 1 parámetro
                print((String a) -> a.startsWith("test")); // 1 parámetro
                print((a, b) -> a.startsWith("test")); // 2 parámetros
                print((String a, String b) -> a.startsWith("test")); // 2 parámetros
         */

        /*
             lambdas invalidos
             print(a, b -> a.startsWith("test")); // faltan ()
             print(a -> { a.startsWith("test"); }); // falta el return
             print(a -> { return a.startsWith("test") }); // falta el ;
         */

        /*
            Lambdas pueden acceder a variables de instancia y estáticas permitidas
                boolean wantWhetherCanHop = true;
                print(animals, a -> a.canHop() == wantWhetherCanHop);
         */

        // (a, b) -> { int a = 0; return 5;} // No podemos volver a declarar una variable local
        // (a, b) -> { int c = 0; return 5;} // valido

    }
}
