package ch01_java_building_blocks.day_thirteen._01_understanding_exceptions._01_the_role_of_exceptions;

public class Zoo {
    // Esta busqueda devuelve -1 es su funcionamiento correcto:
    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);

    }
}
