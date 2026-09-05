package ch01_java_building_blocks.day_twelve._01_implementing_interfaces._01_interface_variables;

public interface CanSwim {
        int MAXIMUM_DEPTH = 100;
        final static boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
}

/*
    Es equilante a definir nuestras variables:
    public interface CanSwim {
        public static final int MAXIMUM_DEPTH = 100;
        public static final boolean UNDERWATER = true;
        public static final String TYPE = "Submersible";
    }
 */