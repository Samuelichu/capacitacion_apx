package ch01_java_building_blocks.day_three._01_understanding_java_operators._04_understanding_java_statements._03_the_switch_statement._02_compile_time_constant_values;

public class Statement {

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;

        /*switch(firstName) {
            case "Test":
                return 52;

            case middleName: no es variable final
                id = 5;
                break;

            case suffix:
                id = 0;
                break;

            case lastName: es un parametro
                id = 8;
                break;

            No son variables del tipo String
            case 5:
                id = 7;
                break;

            case 'J':
                id = 10;
                break;

            case java.time.DayOfWeek.SUNDAY:
                id = 15;
                break;
        }
         */

        return id;
    }
    public static void main(String[] args){
        int dayOfWeek = 5;

        switch(dayOfWeek) {
            default: // Ingresa aqui
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }


        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
        /* Output : Weekday
         *          Saturday
         */




    }
}
