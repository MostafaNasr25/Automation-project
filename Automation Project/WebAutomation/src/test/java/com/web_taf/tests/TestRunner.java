package com.web_taf.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/web_taf/com.api_taf.tests/createCourse.feature",
        glue = "com.web_taf.com.api_taf.tests",
        plugin = {"pretty"
                , "html:target/MyReports/webReport.html"}


)

public class TestRunner {

}
