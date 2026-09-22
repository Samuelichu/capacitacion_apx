package ch01_java_building_blocks.day_eight._05_overloading_methods._05_ptting_it_all_togehter;

public class TooManyConversations {
    public static void play(Long l) { }

    public static void play(Long... l) { }

    public static void main(String[] args) {
        //play(4); Java no es capaz de realizar tantas conversiones
        play(4L); // llama a la versión Long
    }
}
