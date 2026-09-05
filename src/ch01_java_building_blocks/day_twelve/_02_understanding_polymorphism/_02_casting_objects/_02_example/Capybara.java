package ch01_java_building_blocks.day_twelve._02_understanding_polymorphism._02_casting_objects._02_example;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent; // Rodent no guarda relacion con Capybara

        // Al utilizar esta condicional prevenimos este tipo de errores
        if (rodent instanceof Capybara) {
            Capybara capybara2 = (Capybara) rodent;
        }
    }
}
