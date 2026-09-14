package ch01_java_building_blocks.day_one._03_understanding_package_declarations_and_imports._02_redundant_imports;

import java.lang.System; // redundante import automatico
import java.lang.*; // redundante import automatico
import java.util.Random;
import java.util.*; // redundante
public class ImportExample {
    public static void main (String[] args){
        Random r = new Random();
        System.out.println(r.nextInt(10)); // Imprime numeros entre 0 y 9
    }
}
