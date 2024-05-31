package com.MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"}, //the path of the feature files
        glue={"com.stepDefinitions","com.Hooks"}, //the path of the step definition files
        plugin = {"pretty",
                "html:target/cucumber/report.html",
                "json:target/cucumber/Cucumber.json"
                // extent-spark report adapter
        },
        monochrome = true, //display the console output in a proper readable format
        dryRun = false //to check the mapping is proper between feature file and step def file

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
