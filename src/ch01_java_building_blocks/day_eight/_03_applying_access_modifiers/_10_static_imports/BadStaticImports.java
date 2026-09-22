package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._10_static_imports;

//import static java.util.Arrays; No esta importando a un miembro static sino a la clase
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; No sigue el orden de declaracion

/*
    Hay que tener cuidado con las importaciones a 2 clases con el mismo nombre
        import static statics.A.TYPE;
        import static statics.B.TYPE;
 */
public class BadStaticImports {

    public static void main(String[] args) {
        //Arrays.asList("one"); Deberiamos acceder directamente a aslist
    }
}
