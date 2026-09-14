package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._03_important_stringbuilder_methods._03_insert;

public class Insert {
    //StringBuilder insert(int offset, String str);
    public void insertMethod(){
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); // Output: sb = animals-
        sb.insert(0, "-"); // Output: sb = -animals-
        sb.insert(4, "-"); // Output: sb = -ani-mals
        System.out.println(sb);
    }
}
