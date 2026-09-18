package ch01_java_building_blocks.day_ten._03_inheriting_methods._01_overriding_a_method._01_overloading_vs_overriding;

public class Eagle extends Bird {
    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    /* El tipo de retorno debe ser void ya que es un override
        public int eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
        return food;
    }
     */

}
