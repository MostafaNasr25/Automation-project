package com.api_taf.tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com.api_taf.tests/activity.feature",
        glue = "classpath:com.api_taf.tests",
        plugin = {"pretty"
                , "html:target/MyReports/apiReport.html"}

)

public class ApiRunner {

}
