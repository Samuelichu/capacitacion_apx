package ch01_java_building_blocks.day_nine._01_creating_constructors._04_order_of_initialization;

public class InitializationOrderSimple {
     private String name = "Torchie";
     { System.out.println(name); }
     private static int COUNT = 0;
     static { System.out.println(COUNT); }
     static { COUNT += 10; System.out.println(COUNT); }
     public InitializationOrderSimple() {
         System.out.println("constructor");
     }

     /*
        Output:
            0
            10
            Torchie
            constructor
      */
}
