package ch01_java_building_blocks.day_nine._01_creating_constructors;

public class Bunny {
    private String color;

    public Bunny (String color){
        this.color = color;//  asignamos parametro a variable de instancia

        System.out.println("constructor");
    }

    //public bunny() { } debido a que java es canse sensative distingue entre mayusculas y minusculas

    //public void Bunny() { } se considera metodo

    public static void main (String[] args){
        // new Bunny(); Se llama al constructor
    }
}
