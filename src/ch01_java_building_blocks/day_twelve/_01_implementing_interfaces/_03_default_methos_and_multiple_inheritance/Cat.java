package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._03_default_methos_and_multiple_inheritance;

public class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    } // Sobrescribirlo soluciona el dilema de contar con los mismos
     // metodos en ambas interfaces
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
