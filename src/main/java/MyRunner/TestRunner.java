package MyRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:/Users/Pumpkin/IdeaProjects/Selenium-Java-Cucumber/src/main/java/Features/login.feature", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			plugin= {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
//			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

