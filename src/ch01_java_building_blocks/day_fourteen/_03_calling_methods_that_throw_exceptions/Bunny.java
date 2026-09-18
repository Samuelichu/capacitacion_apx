package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions;

public class Bunny {
        /*
            public static void main(String[] args) {
                eatCarrot();
            }
         */

        public static void main(String[] args)
                throws NoMoreCarrotsException { // declara la excepción
            eatCarrot();
        }

        /* Otra opcion para manejar la exception
        public static void main(String[] args) {
            try {
                eatCarrot();
            } catch (NoMoreCarrotsException e) { // maneja la excepción
                System.out.print("sad rabbit");
            }
        }
         */

        private static void eatCarrot() throws NoMoreCarrotsException {
        }
}

class NoMoreCarrotsException extends Exception {}

