package ch01_java_building_blocks.day_one._03_understanding_package_declarations_and_imports;

import java.util.Random; // Sin esta importacion nuestro codigo no funciona

public class ImportExample {
    public static void main (String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10)); // Imprime numeros entre 0 y 9
    }
}
