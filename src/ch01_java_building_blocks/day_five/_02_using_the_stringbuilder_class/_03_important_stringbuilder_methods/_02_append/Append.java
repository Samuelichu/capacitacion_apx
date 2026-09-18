package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._03_important_stringbuilder_methods._02_append;

public class Append {
    //StringBuilder append(String str)
    public void Append (){
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);

        System.out.println(sb); // Output: 1c-true
    }
}
