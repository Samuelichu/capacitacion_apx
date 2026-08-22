package ch01_java_building_blocks.day_four._02_understanding_avanced_flow_control._02_adding_optional_labels;

public class OptionalLabels {
    public static void main (String[] args){
        int[][] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}
        };

        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}
