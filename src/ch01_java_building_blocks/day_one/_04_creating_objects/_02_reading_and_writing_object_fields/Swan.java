package ch01_java_building_blocks.day_one._04_creating_objects._02_reading_and_writing_object_fields;

public class Swan {
    int numberEggs; // instanciamos la variable
    public static void main (String[] args){
        Swan mother = new Swan();
        mother .numberEggs = 1; // seteamos el valor de la variable
        System.out.println(mother.numberEggs); // leemos el valor de la variable
    }
}
