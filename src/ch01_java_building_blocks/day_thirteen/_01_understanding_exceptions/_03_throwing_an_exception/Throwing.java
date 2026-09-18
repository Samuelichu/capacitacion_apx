package ch01_java_building_blocks.day_thirteen._01_understanding_exceptions._03_throwing_an_exception;

public class Throwing {
    public static void main (String[] args) throws RuntimeException {
        String[] animals = new String[0];
        System.out.println(animals[0]);

        // Solicitarle a java que lance un excepcion
        //throw new Exception();
        // throw new Exception("Ow! I fell.");
        throw new RuntimeException();
        //throw new RuntimeException("Ow! I fell.");
    }


}
