package ch01_java_building_blocks.day_nine._01_creating_constructors._02_overloading_constructors;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight) {
        // Hamster(weight, "brown") No funciona debido a que l llamada a los constructores debe ser por new
        // new Hamster(weight, "brown"); No cumple ocn nuestro objetivo
       /*
           Codigo repetido
            this.weight = weight;
            color = "brown";
        */
        //System.out.println("in constructor"); No podemos colocar instrucciones antes de un this
        this(weight, "brown"); // Ahora si llamamos al constructor con 2 parametros
    }

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
