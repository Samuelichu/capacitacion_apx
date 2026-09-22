package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._02_printing_an_exception;

import java.io.IOException;

public class SwallowingException {
    public static void main(String[] args) {
        String textInFile = null;

        try {
            readInFile();
        } catch (IOException e) {
            // se ignora la excepcion
        }
        System.out.println(textInFile.replace(" ", ""));
    }

    private static void readInFile() throws IOException {
        throw new IOException();
    }
}
