package ch01_java_building_blocks.day_ten._03_inheriting_methods._01_overriding_a_method._01_example;

public class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    /*  Esto generaría una función recursiva
        public double getAverageWeight() {
            return getAverageWeight() + 20; // INFINITE LOOP
        }
     */

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());// Output: 50
        System.out.println(new Wolf().getAverageWeight()); // Output: 70
    }
}
