package com.api_taf.properties_reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    private static final String apiConfigPath = "resources/api.properties";

    public static Properties setProperties() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream inputStream = new FileInputStream(apiConfigPath);
        configProperties.load(inputStream);
        return configProperties;
    }

}
