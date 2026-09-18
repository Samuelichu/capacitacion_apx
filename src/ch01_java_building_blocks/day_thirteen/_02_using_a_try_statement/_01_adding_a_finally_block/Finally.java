package ch01_java_building_blocks.day_thirteen._02_using_a_try_statement._01_adding_a_finally_block;

public class Finally {
    /*
        try {
            // código protegido
        } catch (exceptiontype identifier) {
            // quien maneja la excepción
        } finally {
            // bloque finally
        }
     */

    void explore() {
        try {
            //seeAnimals();
            //fall();
        } catch (Exception e) {
            //getHugFromDaddy();
        } finally {
            //seeMoreAnimals();
        }
        //goHome();
    }

    /*
        El orden no se está respetando
        try {
            fall();
        } finally {
            System.out.println("all better");
        } catch (Exception e) {
            System.out.println("get up");
        }
     */

    /* Necesita del bloque catch o finally
        try {
            fall();
        }
     */

    /*
        try {
            //fall();
        } finally {
            System.out.println("all better");
        }
     */
}
