package ch01_java_building_blocks.day_one._04_creating_objects._04_order_of_initialization;

public class Chick {
   /* {
        System.out.println(name);
    } Falla primero se debe inicializar la variable name
    */
        private String name = "Fluffy"; // Segundo en ejecutarse
    {
        System.out.println("setting field");
    } // Tercero en ejecutarse
    public Chick(){ // Cuarto en ejecutarse
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main (String[] args){
        Chick chick = new Chick(); // Primero en ejecutarse
        System.out.println(chick.name); // Ultimo en ejecutarse
    }
}

