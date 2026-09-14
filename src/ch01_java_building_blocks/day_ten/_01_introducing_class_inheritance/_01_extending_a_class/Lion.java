package ch01_java_building_blocks.day_ten._01_introducing_class_inheritance._01_extending_a_class;

public class Lion extends Animal{
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }

    /*
        private void roar() {
            System.out.println("The " + age + " year old lion says: Roar!");
            // falla debido a que age es una variable privada
        }
     */

}
