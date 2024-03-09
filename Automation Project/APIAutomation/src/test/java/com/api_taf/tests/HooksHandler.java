package com.api_taf.tests;
import com.api_taf.properties_reading.ReadPropertiesFile;
import io.cucumber.java.Before;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before
    public void setApiProperties() throws IOException {
        properties = ReadPropertiesFile.setProperties();

    }
}
