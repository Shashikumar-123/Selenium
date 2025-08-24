package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/Features/login.feature",glue="stepDefination",
plugin = {"html:target/cucumber-report.html"},monochrome=true)


public class LoginTestRunner extends AbstractTestNGCucumberTests{
	

}

