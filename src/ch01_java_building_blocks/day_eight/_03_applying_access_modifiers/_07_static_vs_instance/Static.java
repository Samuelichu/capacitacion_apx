package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._07_static_vs_instance;

public class Static {
        private String name = "Static class";

        public static void first() { }
        public static void second() { }

        public void third() {
            System.out.println(name);
        }

        public static void main(String args[]) {
            first();
            second();
            //third(); Necesitamos que third sea un metodo static
            // pero eso no soluciona el problema sino seria necesario manejar la variable name como Static
        }
}
