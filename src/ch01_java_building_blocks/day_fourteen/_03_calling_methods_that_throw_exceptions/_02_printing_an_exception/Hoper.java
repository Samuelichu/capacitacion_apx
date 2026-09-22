package ch01_java_building_blocks.day_fourteen._03_calling_methods_that_throw_exceptions._02_printing_an_exception;

public class Hoper {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // java.lang.RuntimeException: cannot hop
    //cannot hop
    //java.lang.RuntimeException: cannot hop
    //at trycatch.Handling.hop(Handling.java:15)
    //at trycatch.Handling.main(Handling.java:7)

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
