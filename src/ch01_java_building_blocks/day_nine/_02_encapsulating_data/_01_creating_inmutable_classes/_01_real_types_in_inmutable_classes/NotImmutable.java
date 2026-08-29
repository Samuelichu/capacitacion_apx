package ch01_java_building_blocks.day_nine._02_encapsulating_data._01_creating_inmutable_classes._01_real_types_in_inmutable_classes;

public class NotImmutable {
    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder());
    }
}
