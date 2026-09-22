package ch01_java_building_blocks.day_thirteen._02_using_a_try_statement;

public class TryCatch {
    /*
        try {
            // El bloque try también se conoce como
            // código protegido
        } catch (exception_type identifier) {
            // quien maneja excepción
        }
     */

    /*
        Siempre se necesita trabajar con llaves.
           try
                fall();
            catch (Exception e)
                System.out.println("get up");
     */

    /*
        Y siempre debe acontecerle un bloque catch
          try {
            fall();
          }
     */

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            //getUp();
        }
        //seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
    }
}
