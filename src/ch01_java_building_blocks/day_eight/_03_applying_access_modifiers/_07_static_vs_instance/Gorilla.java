package ch01_java_building_blocks.day_eight._03_applying_access_modifiers._07_static_vs_instance;

public class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        //babyGorilla(); Es un metodo de instancia no es un metodo static
    }

    public int total;

   //public static average = total / count; Llama a una variable de instancia
}
