package ch01_java_building_blocks.day_nine._02_encapsulating_data._01_creating_inmutable_classes._01_real_types_in_inmutable_classes;

public class Mutable {
    private StringBuilder builder;

    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    /*
     otra idea de getter:
        public String getValue() {
            return builder.toString();
        }
     */

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("initial");
        Mutable problem = new Mutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
    }
}
