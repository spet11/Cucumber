package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\sanju\\IdeaProjects\\BDD\\src\\test\\resources\\Feature\\Register.Feature"
        ,glue = {"StepDefinition"}
      //  ,dryRun = false
       //,format = {"pretty","html:htmlReport","json:jsonReport","junit:junit/cucumber.xml"}
       // ,monochrome = false
        //,strict = false
)

public class TestRunner {

}
