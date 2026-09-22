package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions;

public class BadException {
    public void bad() {
        /*
            try {
            eatCarrot();
            } catch (NoMoreCarrotsException e) { // NO COMPILA
                System.out.print("sad rabbit");
            }
         */
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    private static void eatCarrot() {
    }
}
