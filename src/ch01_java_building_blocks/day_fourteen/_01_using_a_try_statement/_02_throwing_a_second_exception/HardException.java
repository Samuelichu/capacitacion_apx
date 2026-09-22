package ch01_java_building_blocks.day_fourteen._01_using_a_try_statement._02_throwing_a_second_exception;

public class HardException {
    public String exceptions() {
        String result = "";
        String v = null;

        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }

        return result;
    }
}
