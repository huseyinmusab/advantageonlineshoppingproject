package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //html =TYPE OF THE REPORT
        //target = destination(REPORT FOLDER)
        //default-cucumber-reports=REPORT NAME
        plugin = {
                "html:target/default-cucumber-reports ",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "./src/test/resources/features",

        glue = "stepdefinitions",


        tags = "@bezahlung",
        dryRun = false

)

public class Runner {



}
