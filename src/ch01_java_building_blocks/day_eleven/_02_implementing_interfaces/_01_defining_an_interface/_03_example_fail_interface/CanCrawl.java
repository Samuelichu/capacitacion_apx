package ch01_java_building_blocks.day_eleven._02_implementing_interfaces._01_defining_an_interface._03_example_fail_interface;

public interface CanCrawl {
}

/*
    No es correcto agregar este tipo de modificadores
        private final interface CanCrawl {
        private void dig(int depth);
        protected abstract double depth();
        public final void surface();
        }
 */
