package ch01_java_building_blocks.day_one._03_understanding_package_declarations_and_imports._01_wildcards;

import java.util.*; // Importar todas las clases del package - Wildcard "*"

public class ImportExample {
    public static void main (String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
