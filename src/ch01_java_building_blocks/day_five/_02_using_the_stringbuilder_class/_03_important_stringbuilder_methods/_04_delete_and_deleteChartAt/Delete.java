package ch01_java_building_blocks.day_five._02_using_the_stringbuilder_class._03_important_stringbuilder_methods._04_delete_and_deleteChartAt;

public class Delete {

    /*
     StringBuilder delete(int start, int end)
     StringBuilder deleteCharAt(int index)
    */
    public void deleteMethod(){
        StringBuilder sb = new StringBuilder("abcdef");

        sb.delete(1, 3); // sb = adef
        sb.deleteCharAt(5); // lanza una excepción al no contar con muchos caracteres
    }
}
