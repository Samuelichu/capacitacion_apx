package ch01_java_building_blocks.day_nine._01_creating_constructors._04_order_of_initialization;

public class YetMoreInitializationOrder {
     static { add(2); }
     static void add(int num) { System.out.print(num + " "); }
     YetMoreInitializationOrder() { add(5); }
     static { add(4); }
     { add(6); }
     static { new YetMoreInitializationOrder(); }
     { add(8); }
     public static void main(String[] args) { }
}
