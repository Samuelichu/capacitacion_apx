package ch01_java_building_blocks.day_fourteen._01_using_a_try_statement._01_catching_various_typrs_of_exceptions;

public class ExhibitClosedForLunch extends ExhibitClosed {
    public void visitPorcupine() {
        try {
            // seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    public void visitMonkeys() {
        try {
            //seeAnimal();
        } catch (ExhibitClosedForLunch e) { // excepción de la subclase
            System.out.print("try back later");
        } catch (ExhibitClosed e) { // excepción de la superclase
            System.out.print("not today");
        }
    }

    public void visitMonkeys2() {
        try {
           // seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }/* bloque no compila debido al orden del catch primero debe ir la subclase
         catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        }
        */
    }

    public void visitSnakes() {
        try {
            //seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        }

        /*catch (ExhibitClosed e) { no compila o no llega al segundo bloque debido a que es tambien una excepcion del tipo RuntimeException
            System.out.print("not today");
           } ambas son
         */
         catch (Exception e) {
            System.out.print("exception");
        }
    }
}

class AnimalsOutForAWalk extends RuntimeException { }

class ExhibitClosed extends RuntimeException { }
