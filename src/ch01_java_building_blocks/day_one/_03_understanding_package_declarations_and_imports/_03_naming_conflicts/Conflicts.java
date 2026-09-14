package ch01_java_building_blocks.day_one._03_understanding_package_declarations_and_imports._03_naming_conflicts;

import java.util.Date;
import java.sql.*;

/* import java.util.*
 * import java.sql.*; error debido a que la clase se encuentra en varios packages
 */

public class Conflicts {
    Date date;
    java.sql.Date sqlDate;
}

class ConflictsTwo {
    java.util.Date date;
    java.sql.Date sqlDate;
}