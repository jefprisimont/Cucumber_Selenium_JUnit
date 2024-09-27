package com.jefri.Helper;

import java.io.File;

public class Utility {

    public static File getJSONSchemaFile (String JSONFile) {
        return new File("src/test/java/com/jefri/Helper/JSONSchemaData/" + JSONFile);
    }
}
