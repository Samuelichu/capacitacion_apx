package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._02_creating_a_stringbuilder;

public class Builder {
    public void usage (){
        StringBuilder sb = new StringBuilder(5);
        // size = 0 , capacity = 5
        sb.append("anim");
        // size = 4 , capacity = 5
        sb.append("als");
        // size = 7 , capacity = 8
    }
}
