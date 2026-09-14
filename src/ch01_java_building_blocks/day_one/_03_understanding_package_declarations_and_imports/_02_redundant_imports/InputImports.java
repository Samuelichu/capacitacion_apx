package ch01_java_building_blocks.day_one._03_understanding_package_declarations_and_imports._02_redundant_imports;

import java.nio.file.*; // contiene ambas clases

//import java.nio.file.Files; Importe por clase
//import java.nio.file.Paths;

/*  casos a no considerar
 *  import java.nio.*; el wildcard solo hace referencia a las clases no a packages
 *  import java.nio.*.*; solo se debe usar un wildcard
 *  import java.nio.files.Paths.*; no importar metodos
 */

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}
