package ch01_java_building_blocks.day_fourteen._01_using_a_try_statement._02_throwing_a_second_exception;

import java.io.FileReader;

public class Throwing {
    public static void main(String[] args) {
        FileReader reader = null;

        /*
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }

         */

        /*
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
         */
    }

    /*
        private static FileReader read() throws IOException {
        }
     */
}
